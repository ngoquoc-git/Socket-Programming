import java.net.*;
import java.io.*;
public class Main {
    public static void main(String[] args){
        GreetServer server = new GreetServer();
        try {
            server.start(5000);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}

