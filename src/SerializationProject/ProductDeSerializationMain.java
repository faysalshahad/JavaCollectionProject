package SerializationProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ProductDeSerializationMain {

    public static void main (String args []) {

        try {
            FileInputStream fileIn = new FileInputStream("product.txt");
            ObjectInputStream obis = new ObjectInputStream(fileIn);

            ProductPracticeSerialization pps2 = (ProductPracticeSerialization)obis.readObject();
            System.out.println(pps2);

            obis.close();
            fileIn.close();
        } catch (IOException e) {
            System.out.println("Could not find the file");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Could not find the file");
            e.printStackTrace();
        } finally {
            System.out.println("We have completed serialization and deserialization");
        }
    }

}
