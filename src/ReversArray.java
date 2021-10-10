import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReversArray {



    public void createArr(){
        int[] myRandomArr = {3, 5, 15, 2, 9, 33, 66, 8, 9, 15};
        System.out.println();
        System.out.println("print arr ");
        for (int arr: myRandomArr) {
            System.out.print(" " + arr + " ");
        }
        List<Integer> refresh = new ArrayList<>();
        for (int arrRefresh: myRandomArr) {
            refresh.add(arrRefresh);
        }
        Collections.reverse(refresh);
        System.out.println();
        System.out.println("print refresh arr");
        for (Integer list: refresh
             ) {
            System.out.print(" " + list + " ");


        }

    }

}
