public class P3 {
    // Create a 2D array of integer type where you will store odd and even
    //numbers. Develop a program which will identify/print the even numbers
    //only.

    public static void main(String[] args) {

        int[][] num = {
                {2, 5, 6, 10, 13},
                {4, 6, 3, 7, 12},
                {3, 7, 10, 18}
        };

        System.out.println("Even numbers: ");

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (num[i][j] % 2 == 0) {
                    System.out.print(num[i][j] + " ");
                }
            }
        }
    }
}






