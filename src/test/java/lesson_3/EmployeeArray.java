package lesson_3;

public class EmployeeArray {
    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Ivanov Ivan Ivanovich", "engineer", "ivanov@gmail.com",
                "+79999999999", 50000, 39);
        employeeArray[1] = new Employee("Petrov Petr Ivanovich", "pilot", "petrov@gmail.com",
                "+78888888888", 70000, 40);
        employeeArray[2] = new Employee("Mikhailov Ivan Petrovich", "doctor", "mikhailov@gmail.com",
                "+79877777777", 60000, 41);
        employeeArray[3] = new Employee("Titov Egor Ivanovich", "football player", "titov@gmail.com",
                "+79981111111", 40000, 42);
        employeeArray[4] = new Employee("Gusev Denis Ivanovich", "driver", "gusev@gmail.com",
                "+79999999999", 50000, 43);

        for (Employee employee : employeeArray)
            if (employee.getAge()>40)
                System.out.println(employee);
    }
}