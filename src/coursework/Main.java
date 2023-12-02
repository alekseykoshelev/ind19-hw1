package coursework;

public class Main {

    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        //Employee[] employees = new Employee[10];
        employees[0] = new Employee("name1", "middle1", "last1", 1000, 1);
        employees[1] = new Employee("name2", "middle2", "last2", 11000, 3);
        employees[2] = new Employee("name3", "middle3", "last3", 12000, 1);
        employees[3] = new Employee("name4", "middle4", "last4", 14000, 5);
        employees[4] = new Employee("name5", "middle5", "last5", 111000, 1);
        employees[5] = new Employee("name6", "middle6", "last6", 9000, 4);
        employees[6] = new Employee("name7", "middle7", "last7", 12000, 2);
        employees[7] = new Employee("name8", "middle8", "last8", 15000, 2);
        employees[8] = new Employee("name9", "middle9", "last9", 7865, 3);
        employees[9] = new Employee("name10", "middle10", "last10", 213111, 1);

        printEmployees();
        System.out.println(sumSalary());
        System.out.println(minSalary());
        System.out.println(maxSalary());
        System.out.println(averageSalary());
        printEmployeeFIO();
        System.out.println(minSalary(2));
        System.out.println(maxSalary(2));
        System.out.println(sumSalary(2));

        System.out.println("----");
        printSalaryGreaterOrEquals(9000);
        System.out.println("----");

        indexSalary(0.2);
        printEmployees();
        print(2);
        System.out.println("----");
        printSalaryLess(11000);
        System.out.println("----");
    }

    private static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static int sumSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    private static int sumSalary(int department) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    private static Employee minSalary() {
        Employee min = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < min.getSalary()) {
                min = employee;
            }
        }
        return min;
    }

    private static Employee minSalary(int department) {
        Employee min = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() != department) {
                continue;
            }
            if (min == null || employee.getSalary() < min.getSalary()) {
                min = employee;
            }
        }
        return min;
    }

    private static Employee maxSalary() {
        Employee max = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > max.getSalary()) {
                max = employee;
            }
        }
        return max;
    }

    private static Employee maxSalary(int department) {
        Employee max = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                if (max == null || employee.getSalary() > max.getSalary()) {
                    max = employee;
                }
            }
        }
        return max;
    }

    private static double averageSalary() {
        return (double) sumSalary() / employees.length;
    }

    private static double averageSalary(int department) {
        var sum = sumSalary(department);
        var count = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                count++;
            }
        }
        return count == 0 ? 0 : (double) sum / count;
    }

    private static void printEmployeeFIO() {
        for (Employee employee : employees) {
            System.out.println(employee.getLastName() + " " + employee.getFirstName() + " " + employee.getMiddleName());
        }
    }


    private static void indexSalary(double percent) {
        for (Employee employee : employees) {
            int newSalary = (int) (employee.getSalary() * (1 + percent));
            employee.setSalary(newSalary);
        }
    }

    private static void indexSalary(double percent, int department) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                int newSalary = (int) (employee.getSalary() * (1 + percent));
                employee.setSalary(newSalary);
            }
        }
    }

    private static void print(int department) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                System.out.println(employee.getId() + " " + employee.getLastName() + " " + employee.getFirstName()
                                   + " " + employee.getMiddleName() + ". " + employee.getSalary());
            }
        }
    }

    private static void printSalaryLess(int salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() < salary) {
                System.out.println(employee.info());
            }
        }
    }

    private static void printSalaryGreaterOrEquals(int salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() >= salary) {
                System.out.println(employee.info());
            }
        }
    }

}
