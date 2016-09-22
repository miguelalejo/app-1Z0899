package ec.ocejwcd.cap5;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by mapp190413 on 22/09/2016.
 */
@WebServlet(name="impHttpSession",urlPatterns = "/impHttpSession")
public class ImpHttpSession extends HttpServlet {

    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
        Writer writer = response.getWriter();
        HttpSession httpSession = request.getSession();
        if(httpSession.isNew()){
            writer.write("BIENVENIDO");
        }else{
            writer.write("HOLA NUEVAMENTE");
        }
    }
}
