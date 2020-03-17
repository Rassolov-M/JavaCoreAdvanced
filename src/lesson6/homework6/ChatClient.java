package lesson6.homework6;

import java.io.IOException;
import java.net.Socket;

public class ChatClient {

    final String SERVER_ADDRESS = "localhost";
    final int SERVER_PORT = 57198;

    public ChatClient() {
        try {
            Socket sock = new Socket(SERVER_ADDRESS, SERVER_PORT);
            new Client(sock, "Клиент");
            while(true){
                if(sock.isClosed()){
                    break;
                }
            }
            System.exit(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new ChatClient();
    }
}