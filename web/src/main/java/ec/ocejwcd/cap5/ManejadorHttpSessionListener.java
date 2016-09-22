package ec.ocejwcd.cap5;
import org.apache.log4j.Logger;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
/**
 * Created by mapp190413 on 19/09/2016.
 */
public class ManejadorHttpSessionListener implements HttpSessionListener {
    Logger LOGGER = Logger.getLogger(ManejadorHttpSessionListener.class);
    public void sessionCreated(HttpSessionEvent event){
        HttpSession httpSession = event.getSession();
        LOGGER.info("CREATED SESSION");
        LOGGER.info(httpSession.getId());
     }

    public void sessionDestroyed(HttpSessionEvent event){
        HttpSession httpSession = event.getSession();
        LOGGER.info("DESTROYED SESSION");
        LOGGER.info(httpSession.getId());

    }

}
