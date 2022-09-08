package vishwa;

public class Shadowing {
    static int v=10; // it is used everywhere in the class scope & it is shadowed at line number 7.
    public static void main(String[] args) {
        System.out.println(v);// prints 10
        int v ;
        //System.out.println(v); we've to initialize to begin the scope.
        v=100;//local var is shadowed the class var by initializing
        System.out.println(v);// prints 100
        func();
    }
    static void func(){
        System.out.println(v);//prints 10
    }
}
