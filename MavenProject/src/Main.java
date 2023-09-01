import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class Main {
    public static void main(String[] args) throws Exception{
       Server server=new Server(1081);
       ServletContextHandler handler = new ServletContextHandler();
      handler.addServlet(HelloServlet.class,"Hello");
        server.setHandler(handler);
       server.start();
       server.join();
    }
}
