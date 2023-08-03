package vishwa;
import java.util.*;
public class CountLowerCaseWords {
    public static void main(String[] args) {
        Scanner skv = new Scanner(System.in);
        String words1=skv.nextLine();
        System.out.println(countLowercaseWords(words1));
    }
    public static int countLowercaseWords(String line) {
        int count = 0;
        String[] words = line.split("\\s+");
        for (String word : words) {
            if (word.matches("[a-z]+")) {
                count++;
            }
        }
        return count;
    }
}
