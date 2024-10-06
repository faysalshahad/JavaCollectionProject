package SerializationProject;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ProductSerializationMain {


    public static void main (String args []) {

        ProductPracticeSerialization pps = new ProductPracticeSerialization("Camera","DSLR","Nikon",2,300.5);

        System.out.println("Product Details are Following : ");
        System.out.println("");
        System.out.println(pps);
        System.out.println("");

        try{
            FileOutputStream fileCr = new FileOutputStream("product.txt");
            ObjectOutputStream obos = new ObjectOutputStream(fileCr);

            obos.writeObject(pps);
            obos.close();
            fileCr.close();

            System.out.println("Serialization has been completed successfully.");
        } catch (IOException e) {
            System.out.println("Could not get to the file");
            e.printStackTrace();
        }

        
    }
}
