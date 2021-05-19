package day3.Task3;

import day3.Task2.Company;

public class Workers {
    protected int countOfEmployers;
    protected double averageSalary;
    protected Workers(int countOfEmployers, double averageSalary) {
        this.countOfEmployers = countOfEmployers;
        this.averageSalary = averageSalary;
    }
    public Workers() {
    }

    public int getCountOfEmployers() {
        return countOfEmployers;
    }

    protected void setCountOfEmployers(int countOfEmployers) {
        this.countOfEmployers = countOfEmployers;
    }

    public double getAverageSalary() {
        return averageSalary;
    }

    protected void setAverageSalary(double averageSalary) {
        this.averageSalary = averageSalary;
    }
}
