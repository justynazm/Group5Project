public class P10 {
    // Write a program to print out duplicate elements from an Array of Strings?

    public static void main(String[] args) {

        String[] word = {"cup", "plate", "cup", "fork", "bowl"};

        for (int i = 0; i < word.length-1; i++) {

            for (int j = i + 1; j < word.length; j++) {
                if (word[i].equals(word[j])) {

                    System.out.print("The duplicate element is: " + word[j]);
                }
            }
        }
    }
}