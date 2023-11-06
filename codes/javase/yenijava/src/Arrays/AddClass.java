package Arrays;

import java.util.ArrayList;
import java.util.List;

public class AddClass {

    public static void main(String[] args) {

        List<String> friends=new ArrayList<>();

        friends.add("Mahmud");
        friends.add("Orxan");
        friends.add("Aysel");

        System.out.println(friends);
        for (String friend : friends){
            System.out.print(friend+" ");
        }
    }
}
