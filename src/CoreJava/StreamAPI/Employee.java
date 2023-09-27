package CoreJava.StreamAPI;

public class Employee {
    private int Id;
    private String name;
    private String Dept;
    private Long salary;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public Employee(int id, String name, String dept, Long salary) {
        Id = id;
        this.name = name;
        Dept = dept;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", Dept='" + Dept + '\'' +
                ", salary=" + salary +
                '}';
    }
}
