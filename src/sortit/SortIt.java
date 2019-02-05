package sortit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortIt {
    public static void main(String[] args) {
        
        Integer[] talen = {4, 1, 77, 2, 3, 9, 7, 8};
        
        List<Integer> talen2 = Arrays.asList(talen);
        
//        Arrays.sort(talen);
        
        talen2.sort(new SortDescending());
        
        for (Integer integer : talen2) {
            System.out.println(integer);
        }
        
//        System.out.println(Arrays.toString(talen));

        ArrayList<String> names = new ArrayList<>();
        
        names.add("Kalle");
        names.add("Adam");
        names.add("Gustav");
        names.add("Bertil");
        names.add("Kajsa");
        
        names.sort(null);
        
        for (String name : names) {
            System.out.println(name);
        }
        
        
       
    }

}