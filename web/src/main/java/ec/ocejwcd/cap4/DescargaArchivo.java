package ec.ocejwcd.cap4;

import org.apache.commons.io.IOUtils;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by mapp190413 on 13/09/2016.
 */
@WebServlet(name = "descargaArchivo",urlPatterns = "descargaArchivo")
public class DescargaArchivo extends HttpServlet {

    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
        response.setHeader("Content-disposition", "attachment; filename="+"shiro-core-1.3.1.jar");
        ServletContext servletContext = getServletContext();
        InputStream inputStream = servletContext.getResourceAsStream("/archivos/shiro-core-1.3.1.jar");
        response.setContentType("application/jar");
        OutputStream outputStream = response.getOutputStream();
        IOUtils.copy(inputStream, outputStream);
        outputStream.close();

    }

    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException{
        response.setHeader("Content-disposition","attachement; filename="+"factura.xml");
        ServletContext servletContext= getServletContext();
        InputStream inputStream = servletContext.getResourceAsStream("/archivos/factura.xml");
        OutputStream outputStream = response.getOutputStream();
        response.setContentType("text/xml");
        IOUtils.copy(inputStream,outputStream);
        outputStream.close();
    }

    public void doPut(HttpServletRequest request,HttpServletResponse response) throws IOException{
        response.setHeader("Content-disposition","attachement; filename="+"hojaVida.pdf");
        ServletContext servletContext= getServletContext();
        InputStream inputStream = servletContext.getResourceAsStream("/archivos/hojaVida.pdf");
        OutputStream outputStream = response.getOutputStream();
        response.setContentType("application/pdf");
        IOUtils.copy(inputStream,outputStream);
        outputStream.close();
    }

    public void doDelete(HttpServletRequest request,HttpServletResponse response) throws IOException{
        response.setHeader("Content-disposition","attachement; filename="+"imagen.png");
        ServletContext servletContext= getServletContext();
        InputStream inputStream = servletContext.getResourceAsStream("/archivos/imagen.png");
        OutputStream outputStream = response.getOutputStream();
        response.setContentType("image/png");
        IOUtils.copy(inputStream,outputStream);
        outputStream.close();
    }
}
