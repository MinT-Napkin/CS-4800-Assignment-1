package com.company.employee;

public class CommissionEmployee extends Employee
{
    private int commissionRate;
    private int grossSales;

    public CommissionEmployee()
    {
        this("N/A", "N/A", "N/A", -1, -1);
    }

    public CommissionEmployee(
            String firstName,
            String lastName,
            String socialSecurityNumber,
            int commissionRate,
            int grossSales)
    {
        super(firstName, lastName, socialSecurityNumber);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    public int getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(int commissionRate) {
        this.commissionRate = commissionRate;
    }

    public int getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(int grossSales) {
        this.grossSales = grossSales;
    }
}
