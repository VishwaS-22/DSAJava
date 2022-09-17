package vishwa;
import java.util.*;
public class MultiDimensionalArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        //Initialization.
        for (int i=0;i<3;i++){  //it's gonna have 3arrs inside 1 main arr.
            list.add(new ArrayList<>());
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);
    }
}
