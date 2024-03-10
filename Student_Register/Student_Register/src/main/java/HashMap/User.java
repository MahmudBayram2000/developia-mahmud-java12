package HashMap;

import java.util.HashMap;

public class User {

    private String name;

    private HashMap<Integer, Computer> computers;

    public User(String name) {
        this.name = name;
        this.computers = new HashMap<>();
    }

    public void addComputer(int id, Computer computer) {
        computers.put(id, computer);
    }

    public Computer getComputer(int id) {
        return computers.get(id);
    }

    public void displayComputers() {
        System.out.println(name);
        for (Integer id : computers.keySet()) {
            Computer computer = computers.get(id);
            System.out.println("Computer ID: " + id + ", Brand: " + computer.getBrand() + ", Model: " + computer.getModel());
        }
    }
}
