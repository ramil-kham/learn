package lesson_3;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Employee {
    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printEmployeeInfo() {
        System.out.println("ФИО сотрудника: " + getName() +
                "должность: " + getPosition() +
                "электронная почта: " + getEmail() +
                "номер телефона: " + getPhoneNumber() +
                "зарплата: " + getPhoneNumber() +
                "возраст: " + getSalary());
    }
}
