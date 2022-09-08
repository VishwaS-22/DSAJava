package vishwa;

public class Passingexample {
    public static void main(String[] args) {
        String name="Vishwa";
        //changename(name);
        changeName(name);
        System.out.println(name); //(No change will occur)
    }

    static void changeName(String naam) {
        naam="vishwa_s";//creating new obj, String is immutable, we cant change or modify.
    }

    //for changing ,if we use sout in this func ,we can able to change.
    static void changename(String naam) {
        naam="Vishwa_sk";
        System.out.println(naam); //Changes will occur
    }
}
