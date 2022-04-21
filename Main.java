import java.net.*;
import java.io.*;
public class Main {
    public static void main(String[] args){
        EchoServer server = new EchoServer();
        server.start(5000);
    }
    
}

