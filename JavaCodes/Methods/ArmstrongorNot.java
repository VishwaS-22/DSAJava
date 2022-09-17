package vishwa;

import java.util.Scanner;

public class ArmstrongorNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        System.out.println(isArmstrong(num));
    }
    static boolean isArmstrong(int n){
        int org=n;
        int sum=0;
        while(n>0){ //153
            int rem=n%10; //3
            sum=sum+rem*rem*rem; //0+3*3*3 =27
            n/=10; // 150/10=15 like that....
        }
        return org == sum;
        //both are same
        /*
        if (org == sum) return true;
        else return false;
        */
    }
}
