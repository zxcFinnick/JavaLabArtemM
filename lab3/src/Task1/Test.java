package Task1;

import Task1.Employee;
import Task1.Report;

public class Test {
    public Test() {
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[]{new Employee("Иванов Иван Иванович", 50000.0),
                new Employee("Петров Петр Петрович", 45000.0),
                new Employee("Сидоров Сидор Сидорович", 45000.0),
                new Employee("Зозуля Зоя Петровна", 35000.0),
                new Employee("Лукьянова Тамара Ивановна", 47000.0)};
        Report.generateReport(employees);
    }
}
