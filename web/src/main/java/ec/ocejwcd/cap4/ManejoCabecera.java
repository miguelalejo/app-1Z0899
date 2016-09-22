package ec.ocejwcd.cap4;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by mapp190413 on 15/09/2016.
 */
@WebServlet(name = "manejoCabecera",urlPatterns = "manejoCabecera")
public class ManejoCabecera extends HttpServlet {
    @Override
    public void doHead(HttpServletRequest servletRequest, HttpServletResponse servletResponse){
        servletResponse.addHeader("color-X","Azul");
        servletResponse.addHeader("color-X","Amarillo");
        servletResponse.addHeader("color-Y","Rosa");
        servletResponse.addHeader("color-Z","Negro");
    }

    @Override
    public void doPost(HttpServletRequest servletRequest, HttpServletResponse servletResponse){
        servletResponse.setHeader("color-X", "Verde");
        servletResponse.addHeader("color-X","Amarillo");
        servletResponse.setHeader("color-Y", "Blanco");
        servletResponse.setHeader("color-Y", "Azul");
    }
}
