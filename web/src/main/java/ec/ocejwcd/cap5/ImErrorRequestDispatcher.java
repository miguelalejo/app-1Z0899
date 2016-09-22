package ec.ocejwcd.cap5;

import ec.ocejwcd.entidad.Dog;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by mapp190413 on 22/09/2016.
 */
@WebServlet(name = "imErrorRequestDispatcher",urlPatterns = "/imErrorRequestDispatcher")
public class ImErrorRequestDispatcher extends HttpServlet {

    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
        Writer writer = response.getWriter();
        Dog dog = new Dog("BARK BARK");
        request.setAttribute("dog",dog);
        writer.write("SALUDOS REQUEST");
        writer.flush();
        RequestDispatcher dispatcher = getServletContext().getNamedDispatcher("dispatchPage");
        dispatcher.forward(request,response);
    }
}
