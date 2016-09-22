package ec.ocejwcd.cap4;

import org.apache.log4j.Logger;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;
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
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
        LOGGER.info("DO GET:"+valor);
        Writer writer = response.getWriter();
        writer.write("DO GET");
    }

    public void doHead(HttpServletRequest request,HttpServletResponse response) throws IOException {
        LOGGER.info("DO HEAD:"+valor);
        Writer writer = response.getWriter();
        writer.write("DO HEAD");
    }

    public void doPut(HttpServletRequest request,HttpServletResponse response) throws IOException {
        LOGGER.info("DO PUT:"+valor);
        Writer writer = response.getWriter();
        writer.write("DO PUT");
        String  thisLine = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));
        while ((thisLine = br.readLine()) != null) {
            writer.write(thisLine);
        }
    }

    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
        LOGGER.info("DO POST:"+valor);
        Writer writer = response.getWriter();
        writer.write("DO POST");

    }

    public void destroy(){
        LOGGER.info("DESTROY:"+valor);
    }
}
