package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class classfourth {

    public static void main(String[] args) {

        List<String> Letters=new ArrayList<>();

        Letters.add("A");
        Letters.add("B");
        Letters.add("A");
        Letters.add("C");
        Letters.add("B");
        Letters.add("D");

        Set<String> Dublicate=new HashSet<>(Letters);

        System.out.println(Dublicate);
    }
}
