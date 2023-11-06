package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JavaSix {
    public static void main(String[] args) {

        List<String> Letterss=new ArrayList<>();
        Letterss.add("B");
        Letterss.add("S");
        Letterss.add("M");
        Letterss.add("S");
        Letterss.add("M");
        Letterss.add("W");

        Set<String> Dub=new HashSet<>();

        for (String n:Letterss){
            Dub.add(n);
        }
        System.out.println(Letterss);
        System.out.println(Dub);
    }
}
