package ec.ocejwcd.cap3;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by mapp190413 on 09/09/2016.
 */
public class ColorServlet extends HttpServlet {

    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
        String color = request.getParameter("color");
        Writer writer = response.getWriter();
        writer.write(request.getMethod());
        writer.write(color);
    }

    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
        String color = request.getParameter("color");
        Writer writer = response.getWriter();
        writer.write(request.getMethod());
        writer.write(color);
    }
}
