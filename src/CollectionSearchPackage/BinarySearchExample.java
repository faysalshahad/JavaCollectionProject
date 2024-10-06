package CollectionSearchPackage;


import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BinarySearchExample {

    public static void main (String args []) {

        Integer a [] = {3,6, 8,9,12,37,89,45,82,53,62,99,78,32};

        Arrays.sort(a);

        

        System.out.println("Printing the ascending order sorted Array = ");
        System.out.println(Arrays.toString(a));
        

        int target = 10;

        int target2 = 82;

        int result = binarySearchMethod(a, target);

        BinarySearchExample bne = new BinarySearchExample();

        int result2 = bne.binarySearchMethod2(a, target2);

        if (result == -1) {
            System.out.println("No Value is found inside the array.");
            
        } else
        System.out.println("The value is " + result);


     if (result2 == -1)
        System.out.println("No Value is found inside the array.");
        else
     System.out.println("The value is " + result2);

     //Reversing an array

    List<Integer> revArr = Arrays.asList(a); //Converting the arrray into a list collection

    Collections.reverse(revArr); //reversing the collection

    int minValue = Collections.min(revArr);
    int maxValue = Collections.max(revArr);

    System.out.println("Minimum Value in Array is = " + minValue);
    System.out.println("Maximum Value in Array is = " + maxValue);

    a = revArr.toArray(a); //  Converting the list collection into an array.

    System.out.println("Printing the descending order sorted array =");
    System.out.println(Arrays.toString(a));

   //Arrays.sort(a, Collections.reverseOrder());
    //System.out.println(Arrays.toString(a));

    //Arrays.sort(a, Collections.reverseOrder());


}

    static int binarySearchMethod(Integer arr  [] , int searchValue){

        int start = 0;
        int end = arr.length -1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (searchValue > arr[mid]) {
                start  = mid + 1;
            } else if (searchValue < arr[mid]) {
            end = mid -1;
        } else {
            return arr[mid];
        }

    }
    return -1;
}

int binarySearchMethod2(Integer arr  [] , int searchValue){

    int start = 0;
    int end = arr.length -1;

    while (start <= end) {
        int mid = (start + end) / 2;

        if (searchValue > arr[mid]) 
            start  = mid + 1;
        else if (searchValue < arr[mid])
        end = mid -1;
        else
        return arr[mid];

}
return -1;
}


}
