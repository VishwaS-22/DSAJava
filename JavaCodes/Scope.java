package vishwa;

public class Scope {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        {
            //int a = 10; // already declared
            a=100; //updated
            System.out.println(a); //prints 100
            int c=30;
        }
        System.out.println(a);//prints 100
        //System.out.println(c); we cant access var c,that is defined inside the block.
        int c=30; // but we can define it again coz main func doesn't know it is already declared inside the block.
        System.out.println(c);
    }
}
