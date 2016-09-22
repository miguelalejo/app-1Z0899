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
@WebServlet(name="servletSincB",urlPatterns = "/servletSincB")
public class ServletSincB extends HttpServlet {
    public synchronized void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
        Writer writer = response.getWriter();
        getServletContext().setAttribute("foo", "NUEVO FOO");
        writer.write((String) getServletContext().getAttribute("foo"));
    }
}
