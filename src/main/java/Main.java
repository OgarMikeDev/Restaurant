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

        /*
        TODO
         Задание:
         Создать 3 поваров.
         Зп каждого повара зависит от стажа работа и
         совокупности % от дохода компании и сlientSalary.
         если повар работает до 1 года,
         он получает свою зп(сlientSalary) + 8% от сlientSalary.
         Если же повар работает от 1 года до 4 лет
         он получают свою зп + 11% от сlientSalary + 4% от incomeRestaurant
         */
    }
}
