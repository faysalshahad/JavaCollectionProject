package MessagingApplication;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MessagingServer {

    public static void main (String args []) {
        try {
        ServerSocket serverSocket = new ServerSocket(4070);
        System.out.println("Server started ==================");
        System.out.println("Waiting for client!");
        System.out.println("");

        //Accept client connection
        Socket sc = serverSocket.accept();
        System.out.println("Client is connected now!");
        System.out.println("");

        BufferedReader clientReader = new BufferedReader (new InputStreamReader(sc.getInputStream()));

        //to send message to the client
        PrintWriter serverWriter = new PrintWriter(sc.getOutputStream(),true);

        BufferedReader serverInputreader = new BufferedReader(new InputStreamReader(System.in));

        String  clientMessage, serverMessage;

        while (true) {

            //Read Message from client
            clientMessage = clientReader.readLine();
            if(clientMessage.equalsIgnoreCase("exit")) {
                System.out.println("Client has stopped the connection!");
                //Send disconnection message to server
                break;
                //Exit Loops if the client types "exit"
            }
            System.out.println("Client: " + clientMessage);

            //Get server's response from the console
            System.out.println("You :");

            serverMessage = serverInputreader.readLine();

            if(serverMessage.equalsIgnoreCase("exit")){
                serverWriter.println("Server has stopped the connection!");
                //Send disconnection message to the client
                break;
                //Exit loop if the server types "exit"
            }
            //Send server message to the client
            serverWriter.println(serverMessage);
            
        }

        sc.close();
        serverSocket.close();
        clientReader.close();
        serverWriter.close();
        serverInputreader.close();

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

}
