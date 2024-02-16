package com.company.employee;

public class SalariedEmployee extends Employee
{
    private int weeklySalary;

    public SalariedEmployee()
    {
        this("N/A", "N/A", "N/A", -1);
    }

    public SalariedEmployee(
            String firstName,
            String lastName,
            String socialSecurityNumber,
            int weeklySalary)
    {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    public int getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(int weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
}
