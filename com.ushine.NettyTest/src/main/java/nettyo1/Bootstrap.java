package nettyo1;


public class Bootstrap {

    private static final int PORT= 7777;

    public  static void main(String[] arg){
        Server server = new Server(PORT);
        Server.start();

    }

}
