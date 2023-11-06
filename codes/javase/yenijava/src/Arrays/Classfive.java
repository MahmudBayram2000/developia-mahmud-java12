package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Classfive {
    public static void main(String[] args) {

        List<String> Names=new ArrayList<>();
        Names.add("Mahmud");
        Names.add("Orxan");

        List<String> Names2=new ArrayList<>();
        Names2.add("Aysel");
        Names2.add("Yusif");

        List<String> Merged=new ArrayList<>(Names);
        Merged.addAll(Names2);

        for (String elements : Merged){
            System.out.println(elements);
        }

    }
}
