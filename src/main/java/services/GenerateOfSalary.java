package services;

import model.Employee;

/*
TODO
  GenerateOfSalary -
  для обязательного формирования зп
  каждому сотруднику
 */
public interface GenerateOfSalary {
    /*
    TODO
     т.к. все сотрудники
     имеют разные способы формирования зп,
     generateOfSalary() не имеет {},
     т.е. реализации
     */
    void generateOfSalary(Employee employee);
}
