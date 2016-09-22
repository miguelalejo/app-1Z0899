package ec.ocejwcd.cap5;
import org.apache.log4j.Logger;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
/**
 * Created by mapp190413 on 19/09/2016.
 */
public class ManejadorServletRequestListener implements ServletRequestListener {
    Logger LOGGER = Logger.getLogger(ManejadorServletRequestListener.class);
    public void requestInitialized(ServletRequestEvent event){
        LOGGER.info("REQUEST INITIALIZED");
        LOGGER.info(event.getServletRequest());
        LOGGER.info(event.getServletContext());
    }

    public void requestDestroyed(ServletRequestEvent event){
        LOGGER.info("REQUEST DESTROYED");
        LOGGER.info(event.getServletRequest());
        LOGGER.info(event.getServletContext());
    }
}
