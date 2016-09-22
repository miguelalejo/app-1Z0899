package ec.ocejwcd.cap3;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mapp190413 on 09/09/2016.
 */
public class ColorServlet extends HttpServlet {

    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
        String color = request.getParameter("color");
        String formato = request.getParameter("formato");
        Writer writer = response.getWriter();
        writer.write(request.getMethod());
        writer.write(color+"-"+formato);

        List<String> estilos = new ArrayList<String>();
        estilos.add("MODERNO");
        estilos.add("ORIGINAL");
        estilos.add("ANTIGUO");

        request.setAttribute("estilos",estilos);
        RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
        dispatcher.forward(request,response);
    }

    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
        String color = request.getParameter("color");
        String formato = request.getParameter("formato");
        Writer writer = response.getWriter();
        writer.write(request.getMethod());
        writer.write(color+"-"+formato);
        List<String> estilos = new ArrayList<String>();
        estilos.add("MODERNO");
        estilos.add("ORIGINAL");
        estilos.add("ANTIGUO");
        request.setAttribute("estilos",estilos);
        RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
        dispatcher.include(request, response);
    }

    public void doPut(HttpServletRequest request,HttpServletResponse response) throws IOException{
        String[] listaTamanios=request.getParameterValues("tamanio");
        Writer writer = response.getWriter();
        for(int i=0;i<listaTamanios.length;i++){
            writer.write("TAMANIO:"+listaTamanios[i]);
        }
    }
}
