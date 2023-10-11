package homeworkSecondForLoop;

public class Employee extends Person {

    public double salary;
    public String department;
    public String username;
    public String password;

    public Employee(String name,String surname,int age,String id,String adress,String phone,double salary,String department,String username,String password){
        super(name, surname, age, id, adress, phone);
        this.salary=salary;
        this.department=department;
        this.username=username;
        this.password=password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Username:"+username);
        System.out.println("Password:"+password);
        System.out.println("Department:"+department);
        System.out.println("Salary:"+salary);
    }

}
