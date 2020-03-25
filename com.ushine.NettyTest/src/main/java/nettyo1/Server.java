package nettyo1;

import java.net.Socket;

public class Server {


    public void start() {
        doStart();
        System.out.println("无法执行 到我？");

    }

    private void doStart() {


        while (true) {
            try {

                Socket client = serverSocket.accept();
                new ClientHandler(client).start();
            } catch (Exception e) {
                e.printStackTrace();
            }


        }


    }


}
