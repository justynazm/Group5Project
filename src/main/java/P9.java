public class P9 {
    // Write a java program to find the second largest number in the array?
    public static void main(String[] args) {

        int[] num={23,26,34,56,87};

        int max=num[0];
        int secondMax=num[0];

        for(int i=1; i<num.length; i++) {
            if(num[i]>max){
            secondMax = max;
            max = num[i];
        }else if(num[i]>secondMax && num[i]!=max){
                secondMax=num[i];
            }
        }
        if(max==secondMax) {
            System.out.println("There is no second largest number");
        }else{
            System.out.println("The second largest number is: "+ secondMax);
}

    }
}
