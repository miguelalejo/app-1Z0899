package ec.ocejwcd.cap5;

import org.apache.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
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
public class ParametroServlet extends HttpServlet{

    Logger LOGGER = Logger.getLogger(ParametroServlet.class);

    public void init(ServletConfig servletConfig) throws ServletException {
        super.init(servletConfig);
        LOGGER.info(servletConfig.getInitParameterNames());
    }

    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        String email = getServletConfig().getInitParameter("email");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/contacto.jsp");
        request.setAttribute("email",email);
        requestDispatcher.forward(request,response);

    }

    public void doPut(HttpServletRequest request,HttpServletResponse response) throws IOException {
        ServletConfig servletConfig =getServletConfig();
        String email = servletConfig.getInitParameter("email");
        response.getWriter().write(email);
    }

    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println(getServletConfig().getServletName());
        writer.println("INIT CONFIG PARAMETERS");
        Enumeration listaParametros = getServletConfig().getInitParameterNames();
        while(listaParametros.hasMoreElements()){
            writer.println(listaParametros.nextElement());
        }
    }
}
