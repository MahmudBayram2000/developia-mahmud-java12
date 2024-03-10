package Student_Registration;

public class Student {

    private int id;
    private String username;
    private String password;

    private String name;

    private int age;

    private static int nextId = 1;

    public Student(String username, String password, String name, int age){
        this.id=nextId++;
        this.username=username;
        this.password=password;
        this.name=name;
        this.age=age;

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void setNextId(int nextId) {
        Student.nextId = nextId;
    }

    public int getId() {

        return id;
    }

    public String getUsername() {

        return username;
    }


    public String getPassword() {
        return password;
    }



    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }


}
