package lesson5;

public class Employee {

    private String fullName;
    private String position;
    private String eMail;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String eMail, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;

    }

    public String toString() {
        return ("Full Name: " + this.fullName +
                "; Position: " + this.position +
                "; Email: " + this.eMail +
                "; Phone: " + this.phoneNumber +
                "; Salary: " + this.salary +
                "; Age: " + this.age
        );
    }

    public void print() {
        System.out.println(this);
    }


    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    public String geteMail() {
        return eMail;
    }
    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

}
