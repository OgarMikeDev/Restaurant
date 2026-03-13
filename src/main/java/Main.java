import model.Administrator;
import model.Employee;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Waiter(
                "Шаурмян Шаурмен Лавашович",
                40_000,
                LocalDate.of(2024, 1, 1));
        Employee employee2 = new Waiter(
                "Сувлакян Сувлак Лавашович",
                40_000,
                LocalDate.of(2022, 2, 2));
        /*
        TODO
         не добавится employee3,
         т.к. employeeSet добавляет только уникальных сотрудников,
         благодаря equals(Object o) и hashCode()
         */
        Employee employee3 = new Waiter(
                "Сувлакян Сувлак Лавашович",
                40_000,
                LocalDate.of(2022, 2, 2));
        System.out.println(Employee.getEmployeeSet());
    }
}

