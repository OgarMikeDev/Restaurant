package model;

import services.GenerateOfSalary;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*
TODO
 abstract - Employee является вспомогательным,
 его объекты создать нельзя!
 */
public abstract class Employee implements FormationSalary {
    private String fio;
    private int salary;
    private LocalDate dateStartWork;
    //TODO static - не относится к 1-му конкретному сотруднику
    private static int incomeRestaurant = 0;
    /*
    TODO
     employeeSet хранит только неповторяющихся сотрудников.
     new HashSet<>() не сортирует сотрудников по нужному нам полю
     */
    private static Set<Employee> employeeSet = new HashSet<>();

    //TODO Конструктор для установления значений fio, salary и dateStartWork
    public Employee(String fio, int salary, LocalDate dateStartWork) {
        this.fio = fio;
        this.salary = salary;
        this.dateStartWork = dateStartWork;
        //TODO При создании каждого сотрудника, то, что он заработал переходит ресторану
        incomeRestaurant += salary;
        this.formationSalary(this);
        //TODO Текущий сотрудник добавляется в employeeSet
        employeeSet.add(this);
    }

    /*
    TODO
       equals(Object o) и hashCode()
       позволяет employeeSet при добавлении сотрудников,
       проверять значения всех переменных, т.е.
       salary, fio, dateStartWork
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && Objects.equals(fio, employee.fio) && Objects.equals(dateStartWork, employee.dateStartWork);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fio, salary, dateStartWork);
    }

    /*
        TODO
         Геттеры - для получения значений переменных.
         Сеттеры - для установления значений переменным,
         через проверку(контролируемое изменение значения)
         */
    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDate getDateStartWork() {
        return dateStartWork;
    }

    public void setDateStartWork(LocalDate dateStartWork) {
        this.dateStartWork = dateStartWork;
    }

    public static int getIncomeRestaurant() {
        return incomeRestaurant;
    }

    public static Set<Employee> getEmployeeSet() {
        return employeeSet;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fio='" + fio + '\'' +
                ", salary=" + salary +
                ", dateStartWork=" + dateStartWork +
                '}';
    }
}
