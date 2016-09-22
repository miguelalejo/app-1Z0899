package ec.ocejwcd.cap5;

import org.apache.log4j.Logger;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;

/**
 * Created by mapp190413 on 19/09/2016.
 */
public class ManejadorHttpSessionActivationListener  implements HttpSessionActivationListener{
    Logger LOGGER = Logger.getLogger(ManejadorHttpSessionActivationListener.class);
    public void sessionDidActivate(HttpSessionEvent event){
        LOGGER.info("sessionDidActivate");
    }

    public void sessionWillPassivate(HttpSessionEvent event){
        LOGGER.info("sessionWillPassivate");

    }
}