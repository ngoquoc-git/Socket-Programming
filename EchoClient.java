import java.net.*;
import java.io.*;

public class EchoClient{
    private Socket client;
    private PrintWriter output;
    private BufferedReader input;

    public EchoClient(String ip, int port){
        try {
            client = new Socket(ip, port);
            output = new PrintWriter(client.getOutputStream(), true);
            input = new BufferedReader(new InputStreamReader(client.getInputStream()));
            System.out.println("Successfully Connected.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String sendMessage(String msg){
        output.println(msg);
        String res;
        try {
            res = input.readLine();
            return res;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void stopConnetion(){
        try {
            input.close();
            output.close();
        client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
