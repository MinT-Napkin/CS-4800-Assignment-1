package com.company.employee;

public class HourlyEmployee extends Employee
{
    private int wage;
    private int numberOfHoursWorked;

    public HourlyEmployee()
    {
        this("N/A", "N/A", "N/A", -1, -1);
    }

    public HourlyEmployee(String firstName,
                          String lastName,
                          String socialSecurityNumber,
                          int wage,
                          int numberOfHoursWorked)
    {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    public void setNumberOfHoursWorked(int numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked;
    }
}
