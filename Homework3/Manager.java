package Homework3;

import java.util.Arrays;

public class Manager extends Employee {

    private Employee[] subordinates; // Поле для хранения списка подчинённых

    // Конструктор руководителя, который вызывает конструктор суперкласса и инициализирует поле подчинённых
    public Manager(int id, String name, double salary, Employee[] subordinates) {
        super(id, name, salary); // Вызов конструктора суперкласса
        this.subordinates = subordinates; // Инициализация поля подчинённых
    }

    // Геттер и сеттер для поля подчинённых
    public Employee[] getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(Employee[] subordinates) {
        this.subordinates = subordinates;
    }

    // Переопределённый метод toString для вывода информации о руководителе
    @Override
    public String toString() {
        return "Manager{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", salary=" + getSalary() +
                ", subordinates=" + Arrays.toString(subordinates) +
                '}';
    }
    public static void raiseSalary(Employee[] employees, double percent) {
        for (Employee employee : employees) { // Перебираем всех сотрудников в массиве
            if (!(employee instanceof Manager)) { // Если сотрудник не является руководителем
                double newSalary = employee.getSalary() * (1 + percent / 100); // Вычисляем новую зарплату с учётом процента
                employee.setSalary(newSalary); // Устанавливаем новую зарплату сотруднику
            }
        }
    }
}

