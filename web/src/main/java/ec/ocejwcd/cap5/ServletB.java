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
 * Created by mapp190413 on 19/09/2016.
 */
@WebServlet(name = "servletb" ,urlPatterns = "/servletb")
public class ServletB extends HttpServlet {

    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
        request.setAttribute("dog", new Dog("BARK BARK"));
        Writer writer = response.getWriter();
        Enumeration listaAtributos = request.getAttributeNames();
        while(listaAtributos.hasMoreElements()){
            String nombre = (String) listaAtributos.nextElement();
            writer.write(nombre+":"+request.getAttribute(nombre));
        }
        request.removeAttribute("nuevo");
    }
}
