package ec.ocejwcd.cap5;

import org.apache.log4j.Logger;

import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestAttributeEvent;
/**
 * Created by mapp190413 on 19/09/2016.
 */
public class ManejadorServletRequestAttributeListener implements ServletRequestAttributeListener {
    Logger LOGGER = Logger.getLogger(ManejadorServletRequestAttributeListener.class);
    public void attributeAdded(ServletRequestAttributeEvent event){
        String nombre = event.getName();
        Object objeto = event.getValue();
        LOGGER.info("Attribute Added");
        LOGGER.info(nombre+":"+objeto);
    }

    public void attributeReplaced(ServletRequestAttributeEvent event)
    {   String nombre = event.getName();
        Object objeto = event.getValue();
        LOGGER.info("Attribute Replaced");
        LOGGER.info(nombre+":"+objeto);

    }

    public void attributeRemoved(ServletRequestAttributeEvent event){
        String nombre = event.getName();
        Object objeto = event.getValue();
        LOGGER.info("Attribute Removed");
        LOGGER.info(nombre+":"+objeto);
    }
}
