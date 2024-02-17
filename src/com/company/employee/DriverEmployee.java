package com.company.employee;

public class DriverEmployee {
    public static void main(String[] args) {
        SalariedEmployee joeJones = new SalariedEmployee();
        HourlyEmployee stephanieSmith = new HourlyEmployee();
        HourlyEmployee maryQuinn = new HourlyEmployee();
        CommissionEmployee nicoleDior = new CommissionEmployee();
        SalariedEmployee renwaChanel = new SalariedEmployee();
        BaseEmployee mikeDavenport = new BaseEmployee();
        CommissionEmployee mahnazVaziri = new CommissionEmployee();

        joeJones.setFirstName("Joe");
        stephanieSmith.setFirstName("Stephanie");
        maryQuinn.setFirstName("Mary");
        nicoleDior.setFirstName("Nicole");
        renwaChanel.setFirstName("Renwa");
        mikeDavenport.setFirstName("Mike");
        mahnazVaziri.setFirstName("Mahnaz");

        joeJones.setLastName("Jones");
        stephanieSmith.setLastName("Smith");
        maryQuinn.setLastName("Quinn");
        nicoleDior.setLastName("Dior");
        renwaChanel.setLastName("Chanel");
        mikeDavenport.setLastName("Davenport");
        mahnazVaziri.setLastName("Vaziri");

        joeJones.setSocialSecurityNumber("111-11-1111");
        stephanieSmith.setSocialSecurityNumber("222-22-2222");
        maryQuinn.setSocialSecurityNumber("333-33-3333");
        nicoleDior.setSocialSecurityNumber("444-44-4444");
        renwaChanel.setSocialSecurityNumber("555-55-5555");
        mikeDavenport.setSocialSecurityNumber("666-66-6666");
        mahnazVaziri.setSocialSecurityNumber("777-77-7777");

        joeJones.setWeeklySalary(2500);
        renwaChanel.setWeeklySalary(1700);

        stephanieSmith.setWage(25);
        stephanieSmith.setNumberOfHoursWorked(32);
        maryQuinn.setWage(19);
        maryQuinn.setNumberOfHoursWorked(47);

        nicoleDior.setCommissionRate(15);
        nicoleDior.setGrossSales(50000);
        mahnazVaziri.setCommissionRate(22);
        mahnazVaziri.setGrossSales(40000);

        mikeDavenport.setBaseSalary(95000);

        System.out.printf("\nINHERITANCE\n%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s%n",
                "First Name", "Last Name", "Social Sec #", "Weekly Salary", "Wage", "Hours Worked",
                "Commission Rate", "Gross Salary", "Base Salary");

        printEmployeeInfo(joeJones);
        printEmployeeInfo(stephanieSmith);
        printEmployeeInfo(maryQuinn);
        printEmployeeInfo(nicoleDior);
        printEmployeeInfo(renwaChanel);
        printEmployeeInfo(mikeDavenport);
        printEmployeeInfo(mahnazVaziri);
    }

    private static void printEmployeeInfo(Employee employee) {
        System.out.printf("%-20s %-20s %-20s", employee.getFirstName(), employee.getLastName(),
                employee.getSocialSecurityNumber());

        if (employee instanceof SalariedEmployee salariedEmployee) {
            System.out.printf("$%-20d %-20s %-20s %-20s %-20s%n",
                    salariedEmployee.getWeeklySalary(), "-", "-", "-", "-");
        } else if (employee instanceof HourlyEmployee hourlyEmployee) {
            System.out.printf("%-20s $%-20d %-20d %-20s%n",
                    "-", hourlyEmployee.getWage(), hourlyEmployee.getNumberOfHoursWorked(), "-", "-", "-", "-");
        } else if (employee instanceof CommissionEmployee commissionEmployee) {
            System.out.printf("%-20s %-20s %-20s %%%-20d $%-20s %-20s%n",
                    "-", "-", "-", commissionEmployee.getCommissionRate(),
                    commissionEmployee.getGrossSales(), "-");
        } else if (employee instanceof BaseEmployee baseEmployee) {
            System.out.printf("%-20s %-20s %-20s %-20s %-20s $%-20d%n",
                    "-", "-", "-", "-", "-", baseEmployee.getBaseSalary());
        }
    }
}
