package ec.ocejwcd.cap5;
import ec.ocejwcd.entidad.Dog;
import org.apache.log4j.Logger;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletContextEvent;
import java.util.Enumeration;

/**
 * Created by mapp190413 on 19/09/2016.
 */
public class ManejadroServletContext implements ServletContextListener{
    Logger LOGGER = Logger.getLogger(ManejadroServletContext.class);
    public void contextInitialized(ServletContextEvent event){

        LOGGER.info("SE INICIALIZA EL CONTEXTO");
        ServletContext servletContext = event.getServletContext();
        LOGGER.debug(servletContext.getContextPath());
        Enumeration listaParametrosContexto = servletContext.getInitParameterNames();
        while(listaParametrosContexto.hasMoreElements()){
            String nombre = (String) listaParametrosContexto.nextElement();
            LOGGER.info(nombre+":"+servletContext.getInitParameter(nombre));
        }


        Dog dog = new Dog(servletContext.getInitParameter("dog"));
        servletContext.setAttribute("dog",dog);
    }

    public void contextDestroyed(ServletContextEvent event){
        LOGGER.info("SE DESTRUYE EL CONTEXTO");
        ServletContext servletContext = event.getServletContext();
        LOGGER.debug(servletContext.getContextPath());
    }
}
