package org.example;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.session.SessionHandler;
import org.eclipse.jetty.servlet.ServletContextHandler;

import javax.servlet.http.HttpServlet;

public class Main extends HttpServlet {
    public static void main(String[] args) throws Exception {
        Server server=new Server(5451);
        ServletContextHandler handler = new ServletContextHandler();
        SessionHandler sessionHandler=new SessionHandler();
        handler.setSessionHandler(sessionHandler);
        handler.getSessionHandler().setMaxInactiveInterval(60*20);


        handler.addServlet(LoginServlet.class,"/login");
        handler.addServlet(FinalServlet.class,"/final");
        handler.addServlet(ForwardServlet.class,"/forward");
        handler.addServlet(RedirectServlet.class,"/redirect");
        handler.addServlet(CookieServlet.class,"/cookie");
        handler.addServlet(SessionServlet.class,"/session");
        handler.addServlet(SessionFinalServlet.class,"/final-session");
        server.setHandler(handler);
        server.start();
        server.join();



    }
}