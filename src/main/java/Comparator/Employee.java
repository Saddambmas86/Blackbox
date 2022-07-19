package Comparator;

public class Employee implements Comparable<Employee> {

private String name;
private String empid;
private String mobile;

    Employee(String name, String empid, String mobile){
        this.name=name;
        this.empid=empid;
        this.mobile=mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }


    @Override
    public String toString(){
        return name+" "+mobile+" "+empid;
    }


    @Override
    public int compareTo(Employee o) {
        return getEmpid().compareTo(getEmpid());
    }
}
