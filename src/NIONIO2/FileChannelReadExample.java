package NIONIO2;

import java.nio.file.Path;
import java.nio.channels.FileChannel;
import java.nio.file.StandardOpenOption;
import java.nio.ByteBuffer;

public class FileChannelReadExample {


    public static void main (String args []) {

        try {
            Path path = Path.of("fileChannel.txt");
            FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.READ);
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            fileChannel.read(buffer);
            buffer.flip();
            String s = new String(buffer.array(),0,buffer.limit());
            System.out.println("File Contents are following\n" + s);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
