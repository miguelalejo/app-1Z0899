package ec.ocejwcd.cap4;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;
import java.io.*;

/**
 * Created by mapp190413 on 13/09/2016.
 */
public class ParametroRequest extends HttpServlet {

    public void doPost(HttpServletRequest request,HttpServletResponse response ) throws IOException{
        String headerAccept= request.getHeader("Accept");
        String headerAcceptEnconding= request.getHeader("Accept-Encoding");
        String headerAcceptLanguaje= request.getHeader("Accept-Language");
        String headerUserAgent = request.getHeader("User-Agent");
        Writer writer = response.getWriter();
        writer.write(headerAccept);
        writer.write("\n");
        writer.write(headerAcceptEnconding);
        writer.write("\n");
        writer.write(headerAcceptLanguaje);
        writer.write("\n");
        writer.write(headerUserAgent);
        writer.write("\n");

        int headerEntera = request.getIntHeader("numero");
        writer.write(headerEntera);
        writer.write("\n");
        Cookie[] listaCookies = request.getCookies();
        if(listaCookies!=null){
            for(int i=0;i<listaCookies.length;i++){
                writer.write("\n");
                writer.write(listaCookies[i].getName()+"-"+listaCookies[i].getValue()+"-"+listaCookies[i].getMaxAge());

            }
        }
        HttpSession session = request.getSession();
        writer.write(session.getId());
        writer.write("\n");
        String metodo = request.getMethod();
        writer.write(metodo);
        writer.write("\n");
        InputStream inputStream = request.getInputStream();
        if(inputStream!=null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (bufferedReader.read() != -1) {
                writer.write(bufferedReader.readLine());
            }
        }


    }
}
