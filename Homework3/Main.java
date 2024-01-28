package Homework3;

public class Main {

    public static void main(String[] args) {
        // Создаём массив сотрудников
        Employee[] employees = new Employee[4];
        // Создаём сотрудников и добавляем их в массив
        employees[0] = new Employee(1, "Alice", 5000);
        employees[1] = new Employee(2, "Bob", 6000);
        employees[2] = new Employee(3, "Charlie", 7000);
        // Создаём руководителя и добавляем его в массив
        employees[3] = new Manager(4, "David", 8000, new Employee[]{employees[0], employees[1]});
        // Выводим информацию о всех сотрудниках до повышения зарплаты
        System.out.println("Employees before raise:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        // Повышаем зарплату всем сотрудникам, кроме руководителя, на 10%
        Manager.raiseSalary(employees, 10);
        // Выводим информацию о всех сотрудниках после повышения зарплаты
        System.out.println("Employees after raise:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
