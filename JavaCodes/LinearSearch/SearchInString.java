package vishwa;

import java.util.*;
public class SearchInString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str=in.next();
        char ch = in.next().charAt(0);
        //String str="Vishwa";
        //char ch='V';

        //System.out.println(search(str,ch));
        System.out.println(search2(str,ch));
    }
    static boolean search2(String str1,char ch1){
        if(str1.length()<0){
            return false;
        }
        //for each
        for(char ch : str1.toCharArray()){
            if(ch==ch1){
                return true;
            }
        }
        return false;
    }
    static boolean search(String str1,char ch1){
        if(str1.length()<0){
            return false;
        }

        for(int i=0;i<str1.length();i++){
            if(ch1==str1.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
