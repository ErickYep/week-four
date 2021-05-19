package day3.Task2;

public class Accounting extends Workers {
    protected int countOfEmployers;
    protected String departmentName;

    protected void account() {
        System.out.println("Accounting - account");
    }

    protected Accounting(int countOfEmployers, String departmentName) {
        this.countOfEmployers = countOfEmployers;
        this.departmentName = departmentName;
    }
    protected Accounting() {
        this.countOfEmployers = 0;
        this.departmentName = "NoName";
    }

    public int getCountOfEmployers() {
        return countOfEmployers;
    }

    protected void setCountOfEmployers(int countOfEmployers) {
        this.countOfEmployers = countOfEmployers;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    protected void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
