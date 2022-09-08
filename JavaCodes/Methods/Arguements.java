package vishwa;
import java.util.Scanner;
public class Arguements {
    public static void main(String [] args){
        //int sol=sum(6,5);
        //System.out.println(sol);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name:");
        String Myname=in.next();
        String personalized=mygreet(Myname);
        System.out.println(personalized);
    }
    static String mygreet(String name){
        String greeting="Hello "+ name;
        return greeting;
    }

    static int sum(int a,int b){
        int sum=a+b;
        return sum;
    }
}
