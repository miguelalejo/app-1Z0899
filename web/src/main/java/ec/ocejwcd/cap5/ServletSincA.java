package ec.ocejwcd.cap5;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by mapp190413 on 21/09/2016.
 */
@WebServlet(name="servletSincA",urlPatterns = "/servletSincA")
public class ServletSincA extends HttpServlet {

    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
        Writer writer = response.getWriter();
        synchronized (getServletContext()) {
            getServletContext().setAttribute("foo", "22");
            getServletContext().setAttribute("bar", "42");
            writer.write((String) getServletContext().getAttribute("foo"));
            writer.write("\n");
            writer.write((String) getServletContext().getAttribute("bar"));
        }
    }

    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {

        Writer writer = response.getWriter();
        synchronized ( request.getSession()) {
            request.getSession().setAttribute("foo", "22");
            request.getSession().setAttribute("bar", "42");
            writer.write((String) request.getSession().getAttribute("foo"));
            writer.write("\n");
            writer.write((String) request.getSession().getAttribute("bar"));
        }
    }
}
