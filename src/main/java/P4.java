public class P4 {
    // Create a 2D array of integers. Develop a program which will calculate the
    //    //sum of even and odd numbers for that array.

      public static void main(String[] args) {

          int[][] num = {
                   {2, 4, 7, 20, 25},
                   {1, 6, 20, 15, 28},
                   {8, 9, 12, 21, 40}
           };
           int sumEven = 0;
            int sumOdd = 0;
           for (int[] row:num) {
                for (int a:row) {
                    if (a % 2 == 0) {
                        sumEven = sumEven + a;
                    }else{
                        sumOdd = sumOdd + a;
                    }
                }
            }
            System.out.println("Sum of even numbers: " +sumEven);
            System.out.println("Sum of odd numbers: " +sumOdd);

        }
    }

