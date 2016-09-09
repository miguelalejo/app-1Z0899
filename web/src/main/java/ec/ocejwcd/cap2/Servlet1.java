package ec.ocejwcd.cap2;

import org.apache.log4j.Logger;

import javax.servlet.ServletResponse;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by mapp190413 on 09/09/2016.
 */
public class Servlet1 extends HttpServlet {

    Logger LOGGER = Logger.getLogger(Servlet1.class);

    @Override
    public void service(ServletRequest servletRequest,ServletResponse servletResponse) throws IOException{
        LOGGER.info("SERVICE");
        Writer writer = servletResponse.getWriter();
        writer.write("SALUDO");
    }
}
