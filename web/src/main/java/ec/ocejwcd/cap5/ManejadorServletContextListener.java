package ec.ocejwcd.cap5;

import org.apache.log4j.Logger;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by mapp190413 on 19/09/2016.
 */
public class ManejadorServletContextListener implements ServletContextListener {
    Logger LOGGER = Logger.getLogger(ManejadorServletContextListener.class);
    public void contextInitialized(ServletContextEvent event){
        LOGGER.info("contextInitialized");
        LOGGER.info(event.getServletContext().getServletContextName());
    }

    public void contextDestroyed(ServletContextEvent event){
        LOGGER.info("contextDestroyed");
        LOGGER.info(event.getServletContext().getServletContextName());
    }
}
