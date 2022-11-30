package coursework01;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Петр", "Иванович", "Глызин", 1, 65000);
        employees[1] = new Employee("Елена", "Николаевна", "Понтилеева", 2, 50000);
        employees[2] = new Employee("Николай", "Иванович", "Борисов", 1, 54000);
        employees[3] = new Employee("Дмитрий", "Владимирович", "Сухов", 3, 60000);
        employees[4] = new Employee("Алексей", "Викторович", "Поливанов", 4, 70000);
        employees[5] = new Employee("Сергей", "Сергеевич", "Аксенов", 5, 45000);
        employees[6] = new Employee("Антонина", "Александровна", "Колобова", 3, 55000);
        employees[7] = new Employee("Игорь", "Викторович", "Князев", 5, 67000);
        employees[8] = new Employee("Виталина", "Павловна", "Коваль", 2, 76000);
        employees[9] = new Employee("Виктор", "Андреевич", "Лыков", 5, 86000);

        EmployeeService.printEmployeeList(employees);
        EmployeeService.calculateEmployeesSalarySumPrint(employees);
        EmployeeService.calculateMinimumEmployeeSalaryPrint(employees);
        EmployeeService.calculateMaximumEmployeeSalaryPrint(employees);
        EmployeeService.calculateEmployeeAverageSalaryPrint(employees);
        EmployeeService.allEmployeesFullNamePrint(employees);
        }
    }