package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class classthird {
    public static void main(String[] args) {

        List<Integer> numbers=new ArrayList<>();

        numbers.add(55);
        numbers.add(65);
        numbers.add(74);

        Collections.sort(numbers);

        System.out.println(numbers.get(numbers.size()-1));
    }
}
