package org.example;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
/*
http://localhost:110
1/cem
 */
public class Main {
    public static void main(String[] args) throws Exception{
Server server = new Server(1101);
        ServletContextHandler handler=new ServletContextHandler();
        handler.addServlet(CemServlet.class,"/cem");
        server.setHandler(handler);
        server.start();
        server.join();
    }
}