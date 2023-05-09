package vishwa;

import java.util.Scanner;

public class Swithexample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

       /*
        String fruit=in.next();
        switch (fruit) {
            case "Mango":
                System.out.println("King of Fruits");
                break;
            case "Apple":
                System.out.println("Sweet Red Fruit");
                break;
            case "Banana":
                System.out.println("Yellow Fruit");
                break;
            case "Grapes":
                System.out.println("Small Fruit");
                break;
            default:
                System.out.println("Enter a valid Fruit");
                break;
        }
        //New Syntax.
        switch (fruit) {
            case "Mango" -> System.out.println("King of Fruits");
            case "Apple" -> System.out.println("Sweet Red Fruit");
            case "Banana" -> System.out.println("Yellow Fruit");
            case "Grapes" -> System.out.println("Small Fruit");
            default -> System.out.println("Enter a valid Fruit");
        }
        */

        int day=in.nextInt();
        /*
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Enter a valid number");
                break;
        }
        */
        //New Syntax.
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Enter a valid number");
        }
    }
}
