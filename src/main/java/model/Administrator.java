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
        double onePercentIncomeRestaurant = Employee.getIncomeRestaurant() * 1 / 100;
        double threePercentIncomeRestaurant = Employee.getIncomeRestaurant() * 3 / 100;
        double sevenPercentIncomeRestaurant = Employee.getIncomeRestaurant() * 7 / 100;
        double finalSalaryAdministator = 0;
        if (
                employee.getDateStartWork().getYear() + 5 < LocalDate.now().getYear()
        ) {
            finalSalaryAdministator = salaryAdministator + threePercentIncomeRestaurant;
        } else if (employee.getDateStartWork().getYear() + 5 > LocalDate.now().getYear()) {
            finalSalaryAdministator = salaryAdministator + onePercentIncomeRestaurant;
        } else if (employee.getDateStartWork().getYear() + 7 > LocalDate.now().getYear()) {
            finalSalaryAdministator = salaryAdministator + sevenPercentIncomeRestaurant;
        }
        //TODO Если сотрудинк работает более 7 лет, ему считают 7% от дохода компании
        employee.setСlientSalary(finalSalaryAdministator);
    }
}
