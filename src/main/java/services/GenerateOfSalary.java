package services;

import model.Employee;
/*
TODO
  FormationSalary нужен тогда,
  когда все сотрудники(официант, повар, администратор)
  должны иметь одно и тоже действие(формирование зп),
  но способ(реализация) этого действия у всех разный
 */
public interface FormationSalary {
    /*
    TODO
     formationSalary() - не имеет {},
     т.к. повар будет иметь свою реализацию,
     официант свою и
     администратор тоже свою
     */
    void formationSalary(Employee employee);
}

