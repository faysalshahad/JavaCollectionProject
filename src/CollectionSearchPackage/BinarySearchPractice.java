package CollectionSearchPackage;

//import java.util.List;
import java.util.ArrayList;



public class BinarySearchPractice {

    public static void main (String args []) {

        ArrayList<Integer> arl = new ArrayList<>();

        for(int i = 21; i <31 ; i++){
            arl.add(i);
        }

        System.out.println("The Array list has following values = " + arl);

        //


        int targetValue = arl.get(3), cap = BinarySearchProcess (arl, targetValue);

        if (cap == -1) {

            System.out.println("Sorry No Element found");
            
        } else {
            System.out.println("The value is = " + cap);
            
        }

        int targetValue2 = 58, cap2 = BinarySearchProcess (arl, targetValue2);

        if (cap2 == -1) {

            System.out.println("Sorry No Element found");
            
        } else {
            System.out.println("The value is = " + cap2);
            
        }


    }

    static int BinarySearchProcess ( ArrayList <Integer> ar, int tv) {

        int start = 0, end = ar.size() - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (tv > ar.get(mid)) {
                start =  mid + 1;            
            } else if (tv < ar.get(mid)){
                end = mid - 1;
            } else{
                return ar.get(mid);
            }
            
        }

        return -1;
    }



static int LinearSearchProcess ( ArrayList <Integer> ar2, int tv2) {

    //int start = 0, end = ar.size() - 1;

    if (ar2.size() >= tv2){

        for (int i = 0; i <ar2.size(); i++) {

            if (ar2.get(i) == tv2 ) {
                return ar2.get(i);
                
            }

        }
    }
    return -1;
    
}

}
