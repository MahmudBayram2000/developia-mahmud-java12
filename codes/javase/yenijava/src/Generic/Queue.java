package Generic;

import java.util.PriorityQueue;

public class Queue {
    public static void main(String[] args) {

        java.util.Queue<String> m=new PriorityQueue<String>();
        m.add("Mahmud");
        m.add("Orxan");
        m.add("Bayram");
        System.out.println(m);

        java.util.Queue<String> m2=new PriorityQueue<String>();
        m2.add("Mahmud");
        m2.add("Orxan");
        m2.add("Bayram");

        boolean b=true;
        for (String s : m){
            if (!m2.contains(s)) {
                b=false;
                break;
            }


        }

        System.out.println(b);

    }
}
