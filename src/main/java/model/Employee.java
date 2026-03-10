package model;

import services.GenerateOfSalary;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*
TODO
 Employee implements GenerateOfSalary -
 чтобы у каждого сотрудника формировалась зп.
 */
public abstract class Employee implements GenerateOfSalary {
    private String fullName;
    private double monthSalary; //TODO месячная зп
    private double сlientSalary; //TODO доход с 1-го клиента
    private LocalDate dateStartWork;
    //TODO static относится не к 1-го сотруднику, а сразу ко всем
    private static double incomeRestaurant = 0; //TODO доход ресторана
    /*
    TODO
      Set<Employee> employeeSet хранит только неповторяющихся сотрудников.
      Их уникальность он отслеживает благодаря
      equals(Object o) и
      hashCode()
     */
    private static Set<Employee> employeeSet = new HashSet<>();

    //TODO конструктор для создания текущего сотрудника(this)ЯЧ
    public Employee(String fullName, double monthSalary, double сlientSalary, LocalDate dateStartWork) {
        this.fullName = fullName;
        this.monthSalary = monthSalary;
        this.сlientSalary = сlientSalary;
        this.dateStartWork = dateStartWork;
        incomeRestaurant += сlientSalary;
        this.generateOfSalary(this);
        employeeSet.add(this); //TODO this - текущий сотрудник
    }

    public void setСlientSalary(double сlientSalary) {
        this.сlientSalary = сlientSalary;
    }

    public static double getIncomeRestaurant() {
        return incomeRestaurant;
    }

    public double getСlientSalary() {
        return сlientSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(monthSalary, employee.monthSalary) == 0 && Double.compare(сlientSalary, employee.сlientSalary) == 0 && Objects.equals(fullName, employee.fullName) && Objects.equals(dateStartWork, employee.dateStartWork);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, monthSalary, сlientSalary, dateStartWork);
    }

    public static void printAllEmployee() {
        for (Employee currentEmployee : employeeSet) {
            System.out.println("Текущий сотрудник: " + currentEmployee);
        }
    }

    public static void printIncomeRestaurant() {
        System.out.println("Доход ресторана на текущий момент равен " + incomeRestaurant + " руб.");
    }

    /*
    TODO
      toString() позволяет при выводе сотрудника,
      получать значения всех его переменых
     */
    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", monthSalary=" + monthSalary +
                ", сlientSalary=" + сlientSalary +
                ", dateStartWork=" + dateStartWork +
                '}';
    }
}
