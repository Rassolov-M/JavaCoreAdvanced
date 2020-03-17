package lesson6.homework6;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    private Scanner hear;
    private Scanner enter;
    private PrintWriter out;

    private Thread threadIn;
    private Thread threadOut;

    public Client(Socket socket, String name) {
        try {
            hear = new Scanner(socket.getInputStream());
            enter = new Scanner(System.in);
            out = new PrintWriter(socket.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }

        threadOut = new Thread(() -> {
            while (true) {
                if (enter.hasNext()) {
                    String q = enter.next();
                    sedSMS(name+": "+q);
                    if (q.equalsIgnoreCase("END")) {
                        break;
                    }
                }
            }
            close(socket);

        });
        threadOut.start();

        threadIn = new Thread(() -> {
            while (true) {
                if (hear.hasNext()) {
                    String w = hear.nextLine();
                    System.out.println(w);
                    if (w.contains("Closed")) {
                        break;
                    }
                }
            }
            close(socket);
        });
        threadIn.start();
    }
    private void sedSMS(String msg) {
        out.println(msg);
        out.flush();
    }
    private void close(Socket socket){
            threadIn.interrupt();
            threadOut.interrupt();
        try {
            socket.close();
        } catch (IOException e) {}

    }
}