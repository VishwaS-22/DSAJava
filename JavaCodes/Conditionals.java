package vishwa;

public class Conditionals {
    public static void main(String[] args) {
        int salary=60000;
        if(salary>30000){
            salary=salary+5000;
        }else if(salary>40000){
            salary+=10000;
        }else{
            salary+=2500;
        }
        System.out.println(salary);
    }
}
