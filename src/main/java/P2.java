public class P2 {
    // Create an array of integer values. After the array is created, calculate the
    //sum of all stored elements in that array.

    public static void main(String[] args) {

        int[] num = {3,6,7,9,16};
        int sum = 0;
        for(int i=0; i<5; i++) {
            sum = sum + num[i];
        }
        System.out.println("Sum of all elements is "+sum);
        }
    }

