package vishwa;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans=0;
        while(true){
            System.out.print("Enter an operator:");
            char op=in.next().trim().charAt(0);
            if(op=='+'|| op=='-'|| op=='*'|| op=='/'|| op=='%'){
                System.out.print("Enter two numbers:2 ");
                int n1=in.nextInt();
                int n2=in.nextInt();
                if(op=='+'){
                    ans=n1+n1;
                }
                if(op=='-'){
                    ans=n1-n2;
                }
                if(op=='*'){
                    ans=n1*n2;
                }
                if(op=='/'){
                    if(n1!=0){
                        ans=n1/n2;
                    }
                }
                if(op=='%'){
                    ans=n1%n2;
                }
            }else if(op=='x'||op=='X'){
                break;
            }else{
                System.out.println("Invalid Operation!");
            }
            System.out.println(ans);
        }
    }
}
