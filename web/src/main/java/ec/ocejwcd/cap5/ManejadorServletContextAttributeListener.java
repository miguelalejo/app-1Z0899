package ec.ocejwcd.cap5;

import org.apache.log4j.Logger;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextAttributeEvent;

/**
 * Created by mapp190413 on 19/09/2016.
 */
public class ManejadorServletContextAttributeListener implements ServletContextAttributeListener {
    Logger LOGGER = Logger.getLogger(ManejadorServletContextAttributeListener.class);
    public void attributeAdded(ServletContextAttributeEvent event){
        String nombre = event.getName();
        Object objeto = event.getValue();
        LOGGER.info("Attribute Added");
        LOGGER.info(nombre+":"+objeto);
    }

    public void attributeReplaced(ServletContextAttributeEvent event){
        String nombre = event.getName();
        Object objeto = event.getValue();
        LOGGER.info("Attribute Replaced");
        LOGGER.info(nombre+":"+objeto);
    }

    public void attributeRemoved(ServletContextAttributeEvent event){
        String nombre = event.getName();
        Object objeto = event.getValue();
        LOGGER.info("Attribute Removed");
        LOGGER.info(nombre+":"+objeto);
    }
}
