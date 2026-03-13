package model;
import java.time.LocalDate;

public class Waiter extends Employee {
    public Waiter(String fio, int salary, LocalDate dateStartWork) {
        super(fio, salary, dateStartWork);
    }

    @Override
    public void formationSalary(Employee employee) {
        /*
        TODO 
         1) получить зп(через геттер)
         2) получить дату приёма на работу(через геттер)
         3) если сотрудник работает от 1 года и до 3 лет:
                от полученной зп, получить 10%,
                через сеттер для зп, добавить текущую зп + % 10
            если сотрудник работает от 3(невключительно) лет и до 5 лет:
                от полученной зп, получить 15%,
                через сеттер для зп, добавить текущую зп + % 15
         */
        int currentSalary = employee.getSalary();
        LocalDate currentDateStartWork = employee.getDateStartWork();
        System.out.println("Офиц" + (currentDateStartWork.plusYears(1).getYear() <= LocalDate.now().getYear() &&
                currentDateStartWork.plusYears(3).getYear() >= LocalDate.now().getYear()));
        if (currentDateStartWork.plusYears(1).getYear() <= LocalDate.now().getYear() &&
                currentDateStartWork.plusYears(3).getYear() >= LocalDate.now().getYear()) {
            double percent = currentSalary * 10 / 100;
            currentSalary += percent;
            employee.setSalary(currentSalary);
        } else if (currentDateStartWork.plusYears(3).getYear() < LocalDate.now().getYear() &&
                currentDateStartWork.plusYears(5).getYear() >= LocalDate.now().getYear()) {
            double percent = currentSalary * 15 / 100;
            currentSalary += percent;
            employee.setSalary(currentSalary);
        }
    }
}
