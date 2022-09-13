package vishwa;


import java.util.Scanner;

public class Nestedswitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID=in.nextInt();
        String dept=in.next();
        /*
        switch(empID){
            case 1:
                System.out.println("Vishwa");
                break;
            case 2:
                System.out.println("Kunal kushwaha");
                break;
            case 3:
                System.out.println("Emp no.3");
                switch (dept){
                    case "IT":
                        System.out.println("It dept.");
                        break;
                    case "Ece":
                        System.out.println("Ece dept.");
                        break;
                    default:
                        System.out.println("Enter a valid dept.");
                }
                break;
            default:
                System.out.println("Enter a valid empID");
        }
        */
        //New Syntax.
        switch (empID) {
            case 1 -> System.out.println("Vishwa");
            case 2 -> System.out.println("Kunal kushwaha");
            case 3 -> {
                System.out.println("Emp no.3");
                switch (dept) {
                    case "IT" -> System.out.println("It dept.");
                    case "Ece" -> System.out.println("Ece dept.");
                    default -> System.out.println("Enter a valid dept.");
                }
            }
            default -> System.out.println("Enter a valid empID");
        }
    }
}
