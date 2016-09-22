package ec.ocejwcd.cap5;

import org.apache.log4j.Logger;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * Created by mapp190413 on 19/09/2016.
 */
public class ManejadorHttpSessionAttributeListener implements HttpSessionAttributeListener {
    Logger LOGGER = Logger.getLogger(ManejadorHttpSessionBindingListener.class);
    public void attributeAdded(HttpSessionBindingEvent event){
        LOGGER.info("attributeAdded");
        String nombre = event.getName();
        Object objeto = event.getValue();
        LOGGER.info(nombre+":"+objeto);
    }

    public void attributeReplaced(HttpSessionBindingEvent event){
        LOGGER.info("attributeReplaced");
        String nombre = event.getName();
        Object objeto = event.getValue();
        LOGGER.info(nombre+":"+objeto);
    }

    public void attributeRemoved(HttpSessionBindingEvent event){
        LOGGER.info("attributeRemoved");
        String nombre = event.getName();
        Object objeto = event.getValue();
        LOGGER.info(nombre+":"+objeto);
    }
}
