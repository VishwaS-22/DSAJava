package vishwa;
import java.util.*;
public class Overloading { //Means having same name for multiple func. ,but it can exists when parameters are of diff. type
                           //& also checks no. of arguements we are passing, it take which func it wants(refer no. 8 with 20).
    public static void main(String[] args) {
        //func(11);
        //func("Vishwa");
        //int ans=sum(5,6);
        //System.out.println(ans);
        varargs(1,2,3);
        varargs("Vishwa_sk","KunalKushwaha","Saiyam Pathak");

    }
    static void varargs(int ...s){
        System.out.println(Arrays.toString(s));
    }
    static void varargs(String ...k){
        System.out.println(Arrays.toString(k));
    }
    static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a,int b,int c){
        return a+b+c;
    }

    static void func(int a){
        System.out.println(a);
    }
    static void func(String v){
        System.out.println(v);
    }
}
