package ec.ocejwcd.cap5;

import ec.ocejwcd.entidad.Dog;
import org.apache.log4j.Logger;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by mapp190413 on 19/09/2016.
 */
@WebServlet(name = "perro",urlPatterns = "/perro")
public class ManejadorServlerPerro  extends HttpServlet{
    Logger LOGGER = Logger.getLogger(ManejadorServlerPerro.class);
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
        Dog dog= (Dog) getServletContext().getAttribute("dog");
        LOGGER.info(dog.getBreed());
        Writer writer = response.getWriter();
        writer.write("DOG:"+dog.getBreed());
    }
}
