package ec.ocejwcd.cap4;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by mapp190413 on 15/09/2016.
 */
@WebServlet(name = "manejadorSendRedirect",urlPatterns = "/paginas/articulos/2016/manejadorSendRedirect.do")
public class ManejadorSendRedirect extends HttpServlet {

    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
        /*Cuando se utiliza el  / en el metodo de redireccion se direcicona la pagina al nivel del CONTENEDOR*/
        response.sendRedirect("/ocejwcd/redirectContenedor.jsp");
    }

    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException{
        /*Cuando se utiliza el  / en el metodo de redireccion se direcicona la pagina con la URL relativa del servlet*/
        response.sendRedirect("articulo.jsp");
    }

    public void doPut(HttpServletRequest request,HttpServletResponse response) throws IOException{
        /*Cuando se utiliza el  / en el metodo de redireccion se direcicona la pagina con la URL relativa del servlet*/
        response.sendRedirect("../../pagina.jsp");
    }

    public void doHead(HttpServletRequest request,HttpServletResponse response) throws IOException{
        /*Cuando se utiliza la URL del sitio a redireccionar*/
        response.sendRedirect("http://localhost:8080/ocejwcd/index.jsp");
    }

    public void doDelete(HttpServletRequest request,HttpServletResponse response) throws IOException{
        Writer write = response.getWriter();
        write.write("ENVIO A OTRO SITIO");
        write.flush();
        response.sendRedirect("http://localhost:8080/ocejwcd/index.jsp");
    }
}
