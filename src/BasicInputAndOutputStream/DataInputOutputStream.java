package BasicInputAndOutputStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputOutputStream {

    public static void main (String args []) {

        try {
            // Write data to a binary file
            FileOutputStream fos = new FileOutputStream("C:\\Faysal Resource\\Practice Programs\\DataInputOutputStreamdata.bin");
            DataOutputStream dos = new DataOutputStream(fos);

            dos.writeInt(10);
            dos.writeDouble(3.14);
            dos.writeBoolean(true);
            dos.writeUTF("Hello, world!");

            dos.close();
            fos.close();

            // Read data from the binary file
            FileInputStream fis = new FileInputStream("C:\\Faysal Resource\\Practice Programs\\DataInputOutputStreamdata.bin");
            DataInputStream dis = new DataInputStream(fis);

            int intValue = dis.readInt();
            double doubleValue = dis.readDouble();
            boolean booleanValue = dis.readBoolean();
            String strValue = dis.readUTF();

            System.out.println("Integer value: " + intValue);
            System.out.println("Double value: " + doubleValue);
            System.out.println("Boolean value: " + booleanValue);
            System.out.println("String value: " + strValue);

            dis.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


