package coursework01;

public class EmployeeService {

    public static void printEmployeeList(Employee[] employees) {
            System.out.println("Список всех сотрудников: ");
            for (Employee employee : employees) {
                if (employee != null) {
                    System.out.println(employee);
                }
            }
    }

    public static void calculateEmployeesSalarySumPrint(Employee[] employees) {
            System.out.printf("Сумма зарплат сотрудников составляет: %.2f рублей.\n", calculateEmployeesSalarySum(employees));
    }

    private static double calculateEmployeesSalarySum(Employee[] employees) {
        double salarySum = 0;
            for (Employee employee : employees) {
                if (employee != null) {
                    salarySum += employee.getSalary();
                }
            }
        return salarySum;
    }

    public static void calculateMinimumEmployeeSalaryPrint(Employee[] employees) {
            for (Employee employee : employees) {
                if (employee != null) {
                    if (employee.getSalary() == calculateMinimumEmployeeSalary(employees)) {
                        System.out.println("Сотрудник с минимальной зарплатой - " + employee);
                    }
                }
            }
    }

    private static double calculateMinimumEmployeeSalary(Employee[] employees){
        double minimumSalaryEmployee = 0;
            for (int i = 0; i < employees.length; i++) {
                if (i == 0) {
                    minimumSalaryEmployee = employees[i].getSalary();
                }
                if (employees[i] != null) {
                    if (employees[i].getSalary() < minimumSalaryEmployee) {
                        minimumSalaryEmployee = employees[i].getSalary();
                    }
                }
            }
        return minimumSalaryEmployee;
    }

    public static void calculateMaximumEmployeeSalaryPrint(Employee[] employees) {
            for (Employee employee : employees) {
                if (employee != null) {
                    if (employee.getSalary() == calculateMaximumEmployeeSalary(employees)) {
                        System.out.println("Сотрудник с максимальной зарплатой - " + employee);
                    }
                }
            }
    }

    private static double calculateMaximumEmployeeSalary(Employee[] employees) {
        double maximumSalaryEmployee = 0;
            for (Employee employee : employees) {
                if (employee != null) {
                    if (employee.getSalary() > maximumSalaryEmployee) {
                        maximumSalaryEmployee = employee.getSalary();
                    }
                }
            }
        return maximumSalaryEmployee;
    }
    public static void calculateEmployeeAverageSalaryPrint(Employee[] employees) {
            System.out.printf("Средняя зарплата сотрудника составляет: %.2f рублей.\n", calculateEmployeeAverageSalary(employees));
    }

    private static double calculateEmployeeAverageSalary(Employee[] employees) {
        double averageSalary;
        int elementCount = 0;
            for (Employee employee : employees) {
                if (employee != null) {
                    elementCount++;
                }
            }
        averageSalary = calculateEmployeesSalarySum(employees) / elementCount;
        return averageSalary;
    }

    public static void allEmployeesFullNamePrint(Employee[] employees) {
        StringBuilder sb = new StringBuilder();
        sb.append("Ф.И.О. всех сотрудников: " + "\n");
            for (Employee employee : employees) {
                if (employee != null) {
                    String s = employee.getLastName() + " " + employee.getFirstName() + " " + employee.getMiddleName();
                    sb.append(s).append("\n");
                }
            }
        String fullName = sb.toString();
        System.out.print(fullName);
    }
}
