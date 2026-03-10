package model;

import java.time.LocalDate;

public class Administrator extends Employee {
    public Administrator(String fullName, double monthSalary, double сlientSalary, LocalDate dateStartWork) {
        super(fullName, monthSalary, сlientSalary, dateStartWork);
    }

    /*
    TODO
     Администратор по мимо основной зп,
     получает к ней 1% от дохода ресторана
     */
    @Override
    public void generateOfSalary(Employee employee) {
        double salaryAdministator = employee.getСlientSalary();
        double onePercentIncomeRestaurant = Employee.getIncomeRestaurant();
        double finalSalaryAdministator = salaryAdministator + onePercentIncomeRestaurant;
        employee.setСlientSalary(finalSalaryAdministator);
    }
}
