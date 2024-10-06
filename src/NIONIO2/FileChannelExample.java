package NIONIO2;

import java.nio.file.Path;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.StandardOpenOption;
import java.nio.ByteBuffer;

public class FileChannelExample {

    public static void main (String args []) {
        

        try {
            Path path = Path.of("fileChannel.txt");
            FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
            String content = "Hello World!";

            ByteBuffer buffer = ByteBuffer.allocate(1024);
            buffer.put(content.getBytes());

            buffer.flip();
            fileChannel.write(buffer);

        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("Could not create or write on the file!");
            e.printStackTrace();
        }


    }

}
