import model.Administrator;
import model.Employee;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Administrator(
                "Шаурмякин Шаурмен Лавашович",
                80_000,
                500,
                LocalDate.of(2020, 1,2)
        );
        Employee employee2 = new Administrator(
                "Сувлакин Сувлак Сувлакович",
                40_000,
                500,
                LocalDate.of(2025, 4,5)
        );
        Employee.printAllEmployee();
        Employee.printIncomeRestaurant();
    }
}
