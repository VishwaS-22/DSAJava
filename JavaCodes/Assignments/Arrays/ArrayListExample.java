package vishwa;
import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>(1); //initialCapacity doesn't matter,
                                                                // we can give more than initialized capacity.
        /*
        list.add(1); //0th index
        list.add(2); //1st
        list.add(3); //2nd
        list.add(11); //3rd

        System.out.println(list);

        System.out.println(list.contains(3));

        list.set(1,99);//here 1st index value will be changed to 99.

        list.remove(3);

        System.out.println(list);
        */
        //By Iteration.
        for(int i=0;i<5;i++){
            list.add(in.nextInt());
        }
        for(int i=0;i<5;i++){
            System.out.println(list.get(i)); //get method basically get the input values.
        }

    }
}
