package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddClassTwo {
    public static void main(String[] args) {

        List<String> Elements=new ArrayList<>();

        Elements.add("Phone");
        Elements.add("Mouse");
        Elements.add("Computer");
        Elements.add("Apple");

        Collections.sort(Elements);
        Collections.reverse(Elements);
        System.out.println(Elements);
    }
}
