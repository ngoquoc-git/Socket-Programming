import java.net.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        EchoServer server = new EchoServer();
        try {
            server.start(3002);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}

