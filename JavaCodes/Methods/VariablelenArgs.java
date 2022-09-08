package vishwa;

import java.util.*;
public class VariablelenArgs {
    public static void main(String[] args) {
        func(11,22,"Vishwa","Kunal Kushwaha","Pranav");// VarlenArgs will be printed in arr.
    }
    static void func(int a,int b,String ...c){ //Variable length Arguements should always be at last
                                                // coz it is limitless we dont know when b starts.
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(c));
    }
}
