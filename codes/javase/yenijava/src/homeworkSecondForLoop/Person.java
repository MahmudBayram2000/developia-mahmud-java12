package homeworkSecondForLoop;

public class Person {

    public String id;
    public String name;
    public String surname;
    public int age;
    public String adress;
    public String phone;

    public Person(String name,String surname,int age,String id,String adress,String phone){
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.id=id;
        this.adress=adress;
        this.phone=phone;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void printInfo(){
        System.out.println("Id:"+id);
        System.out.println("Name:"+name);
        System.out.println("Surname:"+surname);
        System.out.println("Age:"+age);
        System.out.println("Adress:"+adress);
        System.out.println("Phone:"+phone);

    }
}
