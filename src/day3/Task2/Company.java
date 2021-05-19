package day3.Task2;

public class Company {
    private double income;
    private double taxes;
    private double salary;
    private double profit;
    private double taxCost;

    public Company() {
    }

    protected Company(double income, double taxes) {
        this.income = income;
        this.taxes = taxes;
    }

    protected void calculateSalary(Workers workers) {
        salary = workers.averageSalary * workers.countOfEmployers;
        System.out.println("Month salary cost is : " + salary);
    }

    protected void calculateTaxCost() {
        taxCost = income * taxes / 100;
        System.out.println("Tax Cost is" + taxCost);
    }
    protected void calculateProfit(){
        profit = income - salary - taxCost;
    }

    protected double getIncome() {
        return income;
    }

    private void setIncome(double income) {
        this.income = income;
    }

    protected double getTaxes() {
        return taxes;
    }

    private void setTaxes(double taxes) {
        this.taxes = taxes;
    }

    protected double getSalary() {
        return salary;
    }

    protected double getProfit() {
        return profit;
    }

    protected double getTaxCost() {
        return taxCost;
    }

}
