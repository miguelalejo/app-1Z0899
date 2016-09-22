package ec.ocejwcd.cap5;

/**
 * Created by mapp190413 on 19/09/2016.
 */
import org.apache.log4j.Logger;

import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionBindingEvent ;

public class ManejadorHttpSessionBindingListener implements HttpSessionBindingListener  {
    Logger LOGGER = Logger.getLogger(ManejadorHttpSessionBindingListener.class);
    public void valueBound(HttpSessionBindingEvent  event){
        LOGGER.info("valueBound");
        LOGGER.info(event.getName());
        LOGGER.info(event.getSession().getId());
    }
    public void valueUnbound(HttpSessionBindingEvent  event){
        LOGGER.info("valueUnBound");
        LOGGER.info(event.getName());
        LOGGER.info(event.getSession().getId());
    }
}
