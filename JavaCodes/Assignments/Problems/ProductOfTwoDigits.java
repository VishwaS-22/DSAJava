package vishwa;
import java.util.*;
public class ProductOfTwoDigits {

    public static void main(String[] args) {
        //Your Code Here
        Scanner sc=new Scanner(System.in);
        String num=sc.nextLine();
        for(Integer i=1;i<num.length();i+=2){
            Integer result=Character.getNumericValue(num.charAt(i-1))*Character.getNumericValue(num.charAt(i));
            System.out.print(result+" ");
        }
        if(num.length()%2!=0){
            System.out.print(num.charAt(num.length()-1));
        }
    }
}