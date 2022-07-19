package Collections;

public class Student implements Comparable<Student>{


    private String name;
    private int phone;
    private int EmployeeID;

    public Student(String name, int phone, int EmployeeID){
        this.name=name;
        this.phone=phone;
        this.EmployeeID=EmployeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int employeeID) {
        EmployeeID = employeeID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                ", EmployeeID=" + EmployeeID +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.EmployeeID-o.EmployeeID;
    }
}
