package vishwa;

import java.util.Arrays;
public class NoFixedSizeCol {
    public static void main(String[] args) {

        int[][] a={
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };
        for(int r = 0; r <a.length; r++){
            System.out.println(Arrays.toString(a[r]));
        }

    }
}
