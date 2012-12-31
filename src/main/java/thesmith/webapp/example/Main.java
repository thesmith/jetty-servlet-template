package thesmith.webapp.example;

import thesmith.webapp.JettyServer;
import thesmith.webapp.ServletBinder;

public class Main {

  private void start() {
    JettyServer server = new JettyServer();
    bind(server);
    server.start();
  }

  private void bind(ServletBinder binder) {
    binder.bind("/example", new ExampleServlet());
  }
  
  public static void main(String[] args) {
    new Main().start();
  }
}