package ec.ocejwcd.cap5;

import ec.ocejwcd.entidad.Dog;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by mapp190413 on 19/09/2016.
 */
@WebServlet(name ="attributo",urlPatterns = "/attributo")
public class ImpListenerInterfaceAttribute extends HttpServlet {

    public void doHead(HttpServletRequest request,HttpServletResponse response) throws IOException {
        ServletContext servletContext = getServletContext();
        servletContext.setAttribute("SALUDO","SALUDO HOLA MUNDO");
        servletContext.setAttribute("SALUDO","NUEVO SALUDO");
        servletContext.removeAttribute("SALUDO");
        Writer writer = response.getWriter();
        writer.write("SERVLET CONTEXT ATTRIBUTE");
    }

    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
        HttpSession httpSession = request.getSession(true);

        Writer writer = response.getWriter();
        writer.write("ID:"+httpSession.getId());
        writer.write("HTTP SESSION LISTENER");
    }

    public void doOptions(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("nuevo","ATRIBUTO1");
        request.setAttribute("saludo","HOLA ATRIBUTO1");
        Dog dog = new Dog("MIAU MIAU");
        request.setAttribute("dog",dog);
        request.removeAttribute("saludo");
        RequestDispatcher dispatcher = getServletContext().getNamedDispatcher("servletb");
        dispatcher.forward(request,response);
    }

    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        Dog dog = new Dog("GUA GUA");
        HttpSession session = request.getSession();
        session.setAttribute("dog",dog);
        session.setAttribute("dog2",dog);
        Dog dogNuevo = new Dog("MIA MIA");
        session.setAttribute("dog",dogNuevo);
        session.removeAttribute("dog");
        session.setAttribute("dog",null);


    }

    public void doDelete(HttpServletRequest request,HttpServletResponse response) throws IOException {
        HttpSession httpSession = request.getSession(false);
        httpSession.invalidate();
        Writer writer = response.getWriter();
        writer.write("ID:"+httpSession.getId());
        writer.write("HTTP SESSION LISTENER");
    }
}
