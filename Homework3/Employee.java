package Homework3;
/*
Написать прототип компаратора - метод внутри класса сотрудника, сравнивающий две даты,
представленные в виде трёх чисел гггг-мм-дд, без использования условного оператора.
Опишите класс руководителя, наследник от сотрудника. Перенесите статический метод
повышения зарплаты в класс руководителя,
модифицируйте метод таким образом, чтобы он мог поднять заработную плату всем, кроме руководителей.
В основной программе создайте руководителя и поместите его в общий массив сотрудников.
Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата руководителя не повысилась.
 */
public class Employee {
    private int id;
    private String name;
    private double salary;

    // Конструктор сотрудника
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Геттеры и сеттеры для полей сотрудника
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    // Переопределённый метод toString для вывода информации о сотруднике
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
