public class P7 {
    // Write a Java Program to print the first 10 numbers of Fibonacci series.
    // (Fibanocci series- next number is the sum of previous two numbers)
    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        for (int i = 1; i <= 10; i++) {
            int next = a + b;

            System.out.print(a+" ");

            a = b;
            b = next;


        }
    }
}