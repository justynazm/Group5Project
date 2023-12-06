public class P6 {
    // Write a java program to check whether a given number is prime or not?

    public static void main(String[] args) {

        int num=7;
        int count=0;
        for(int i=1; i<=num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if(count==2) {
            System.out.println(num+ " is a prime number");
        }else{
            System.out.println(num+ " is not a prime number");
            }
        }
    }

