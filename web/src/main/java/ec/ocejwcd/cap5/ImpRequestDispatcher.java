package ec.ocejwcd.cap5;

import ec.ocejwcd.entidad.Dog;
import org.apache.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by mapp190413 on 22/09/2016.
 */
@WebServlet(name="impRequestDispatcher",urlPatterns = "/paginas/disp/implDisp.do")
public class ImpRequestDispatcher extends HttpServlet {
    Logger LOGGER = Logger.getLogger(ImpRequestDispatcher.class);
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        LOGGER.info("DO GET");
        Dog dog= new Dog("GUAGUA");
        request.setAttribute("dog",dog);
        RequestDispatcher dispatcher = request.getRequestDispatcher("dispatcher.jsp");
        dispatcher.forward(request,response);
    }

    public void doHead(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        LOGGER.info("DO POST");
        Dog dog= new Dog("GUAGUA");
        request.setAttribute("dog",dog);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/dispatcher.jsp");
        dispatcher.forward(request,response);
    }

    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        LOGGER.info("DO DELETE");
        Dog dog= new Dog("GUAGUA");
        request.setAttribute("dog",dog);
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/dispatcher.jsp");
        dispatcher.forward(request,response);
    }
}
