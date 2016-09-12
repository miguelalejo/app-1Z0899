package ec.ocejwcd.cap4;

import org.apache.log4j.Logger;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Random;


/**
 * Created by mapp190413 on 12/09/2016.
 */
@WebServlet(name = "clicloVidaServlet",urlPatterns = {"/clicloVidaServlet"})
public class ClicloVidaServlet extends HttpServlet {
    Logger LOGGER = Logger.getLogger(ClicloVidaServlet.class);
    int valor =0;
    public void init()
    {
        ServletContext servletContext = getServletContext();
        LOGGER.info(servletContext.toString());
        Random random = new Random();
        valor = random.nextInt();
        LOGGER.info("INIT:"+valor);
    }
    public void doGet(HttpServletRequest request,HttpServletResponse response){
        LOGGER.info("DO GET:"+valor);
    }

    public void doPost(HttpServletRequest request,HttpServletResponse response){
        LOGGER.info("DO POST:"+valor);
    }

    public void destroy(){
        LOGGER.info("DESTROY:"+valor);
    }
}
