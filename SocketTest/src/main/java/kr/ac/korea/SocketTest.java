package kr.ac.korea;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * Created by kjs on 2015-11-20.
 */
public class SocketTest {
    final static String ADDRESS = "localhost";
    final static int PORT = 5001;
    public static void main(String[] args){
        try {
            Socket socket = new Socket(ADDRESS, PORT);


            for(int i=0; i < 100; i++){
                System.out.println("###output..");
                ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
                outputStream.writeObject("Hello1 Socket Test");
                outputStream.writeObject("Hello2 Socket Test");
                outputStream.flush();
            }

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
