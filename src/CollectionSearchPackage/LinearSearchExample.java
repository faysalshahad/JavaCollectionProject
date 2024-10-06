package CollectionSearchPackage;

public class LinearSearchExample {

    public static void main (String args []) {

        int [] arr = {1, 5, 4, 12, 9, 100, 52, 18, 22, 73};

        int target = 5;

        int target2 = 50;

        int result = LinearSearch(arr, target);

        LinearSearchExample lse = new LinearSearchExample();
        int result2 = lse.LinearSearch2(arr, target2);

        if (result == -1) {
            System.out.println("No Element Found");
        }
        else {
            System.out.println(result);
        }

        if (result2 == -1)
            System.out.println("No Element Found");
        else
            System.out.println(result);



    }



        public static int LinearSearch(int a [], int target) {
            for (int i = 0; i < a.length ; i++) {

                if (a [i] ==  target) {
                    return a[i];
                }
            }
            return -1;
        };

         int LinearSearch2(int b [], int tar) {
            for (int i = 0; i < b.length ; i++) {

                if (b [i] ==  tar)
                    return b[i];
            }
            return -1;
        };
    }

    
