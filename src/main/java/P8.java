public class P8 {
    // Maximum and minimum number in the array?

    public static void main(String[] args) {

        int[] num={5,8,9,17,54};

        int maxNum=num[0];
        int minNum=num[0];

        for(int i=1; i<num.length; i++) {
            if (num[i] > maxNum) {
                maxNum = num[i];
            } else if (num[i] < minNum) {
                minNum = num[i];
            }
        }
                System.out.println("Maximum number is: "+maxNum);
                System.out.println("Minimum number is: "+minNum);
            }
        }
