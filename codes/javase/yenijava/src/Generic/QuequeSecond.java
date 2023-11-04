package Generic;

import java.util.Collections;
import java.util.PriorityQueue;

public class QuequeSecond {
    public static void main(String[] args) {
        PriorityQueue<Integer> m=new PriorityQueue<Integer>(Collections.reverseOrder());
        m.add(38);
        m.add(33);
        m.add(45);
        m.add(55);
        System.out.println(m);
        System.out.println(m.poll());
        System.out.println(m);

    }
}

