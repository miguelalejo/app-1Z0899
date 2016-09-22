package ec.ocejwcd.cap5;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Created by mapp190413 on 15/09/2016.
 */
public class ParametroContexto extends HttpServlet {

    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        ServletContext servletContext = getServletContext();
        String appEmail = servletContext.getInitParameter("appemail");
        PrintWriter writer = response.getWriter();
        writer.println("servletContext:" + appEmail);

        ServletContext servletContextServlet = getServletConfig().getServletContext();
        String appServletEmail = servletContextServlet.getInitParameter("appemail");
        writer.println("servletContextServlet:" + appServletEmail);
        response.setContentType("text/html");

        writer.println(getServletContext().getContextPath());
        writer.println("CONTEXT CONFIG PARAMETERS");
        Enumeration listaParametrosContexto = getServletContext().getInitParameterNames();
        while(listaParametrosContexto.hasMoreElements()){
            writer.println(listaParametrosContexto.nextElement());
        }
    }
}
