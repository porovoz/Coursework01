package coursework01;

import java.util.Objects;

public class Employee {
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private int department;
    private double salary;
    private static int counter = 1;
    private final int id;

    public Employee(String firstName, String middleName, String lastName, int department, double salary) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        if (checkDepartmentValue(department)) {
            this.department = department;
        }
        this.salary = salary;
        id = counter;
        counter++;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        if (checkDepartmentValue(department)) {
            this.department = department;
        }
    }

    private boolean checkDepartmentValue(int department) {
        if (department > 5 || department <= 0) {
            throw new IllegalArgumentException("Значение отдела должно быть от 1 до 5.");
        }
        return true;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && id == employee.id && Objects.equals(firstName, employee.firstName) && Objects.equals(middleName, employee.middleName) && Objects.equals(lastName, employee.lastName) && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, middleName, lastName, department, salary, id);
    }

    @Override
    public String toString() {
        return String.format("Номер в реестре: %d, Ф.И.О. сотрудника: %s %s %s, Отдел: %d, Заработная плата: %.2f рублей",
                id, lastName, firstName, middleName, department, salary);
//                "Номер в реестре: " + id + ", " + "Ф.И.О. сотрудника: " + lastName + " " + firstName +
//                " " + middleName + ", Отдел: " + department + ", " + "Заработная плата: " + salary + " рублей";
    }
}
