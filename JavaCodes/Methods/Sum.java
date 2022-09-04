package vishwa;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum();
    }
    static void sum(){
        Scanner in=new Scanner(System.in);

        System.out.print("Enter 1st number:");
        int n1=in.nextInt();
        System.out.print("Enter 2nd number:");
        int n2=in.nextInt();
        int sum=n1+n2;
        System.out.println("The sum ="+sum);
    }
}
