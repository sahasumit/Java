import java.io.IOException;
import com.sun.net.httpserver.HttpServer;
import java.net.InetSocketAddress;
import com.sun.net.httpserver.HttpExchange;
import java.io.OutputStream;

public class BasicHttpServerExample {
  public static void main(String [] args) throws IOException {
    System.out.println("An example of sample http server in java.");
    HttpServer server = HttpServer.create(new InetSocketAddress(8500), 0);
    server.createContext("/").setHandler(BasicHttpServerExample::handleRequest);
    server.start();
  }

  private static void handleRequest(HttpExchange exchange) throws IOException {
    String response = "Hi there";
    exchange.sendResponseHeaders(200, response.getBytes().length);
    OutputStream os = exchange.getResponseBody();
    os.write(response.getBytes());
    os.close();
  }
}
