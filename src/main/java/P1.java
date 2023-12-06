public class P1 {
    // 1. Create a program that uses an array to store a list of temperatures for a week,
    //and then uses a loop to find the highest and lowest temperature for the week.

    public static void main(String[] args) {

        int[] numbers = {4, 4, 4, 11, 11, 7};

        int highest = numbers[0];
        int lowest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > highest) {
                highest = numbers[i];
            }
            if (numbers[i] < lowest) {
                lowest = numbers[i];
            }
        }

        System.out.println("The highest temperature for the week is: " + highest+" 'C");
        System.out.println("The lowest temperature for the week is: " + lowest+" 'C");
    }

}
