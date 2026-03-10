package model;

import java.time.LocalDate;

public class Waiter extends Employee {
    public Waiter(String fullName, double monthSalary, double сlientSalary, LocalDate dateStartWork) {
        super(fullName, monthSalary, сlientSalary, dateStartWork);
    }

    @Override
    public void generateOfSalary(Employee employee) {
        double сlientSalary = employee.getСlientSalary();
        /*
        TODO
         Если официант работает до 3 лет в ресторане,
         он получает 10 % от сlientSalary,
         если же официант работает от 3 до 5 лет в ресторане,
         он получает 15 % от сlientSalary,
         если же официант работает более 5 лет в ресторане,
         он получает 20 % от сlientSalary
         */
    }
}
