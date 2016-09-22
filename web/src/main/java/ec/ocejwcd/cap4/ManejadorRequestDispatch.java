package ec.ocejwcd.cap4;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by mapp190413 on 15/09/2016.
 */
@WebServlet(name = "manejadorRequestDispatch",urlPatterns = "/paginas/articulos/2016/manejadorRequestDispatch.do")
public class ManejadorRequestDispatch extends HttpServlet {
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/redirectContenedor.jsp");
        requestDispatcher.forward(request,response);
    }

    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("articulo.jsp");
        requestDispatcher.forward(request,response);
    }
}
