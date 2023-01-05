import java.util.Objects;

public class Employee {
    private String fullname;
    private int department;
    private int salary;
    private int counter = 1;
    public static int id;


    public Employee(String fullname, int department, int salary) {
        this.fullname = fullname;
        this.department = department;
        this.salary = salary;
        this.id = counter;
        counter++;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id+" ФИО - " + fullname + " работает в отделе номер " + department + " с зарплатой - " + salary;
    }
}
