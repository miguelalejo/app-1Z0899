package ec.ocejwcd.cap5;

import ec.ocejwcd.entidad.Dog;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;
import java.util.Enumeration;

/**
 * Created by mapp190413 on 21/09/2016.
 */
@WebServlet(name="servletSincC",urlPatterns = "/servletSincC")
public class ServletSincC extends HttpServlet {

    public synchronized void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Writer writer = response.getWriter();
        writer.write((String) getServletContext().getAttribute("foo"));
        writer.write("\n");
        writer.write((String) getServletContext().getAttribute("bar"));
    }
}
