package coursework;

public class EmployeeBook {

    private final Employee[] employees;

    public EmployeeBook(int size) {
        this.employees = new Employee[size];
    }

    public void add(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return;
            }
        }
        System.out.println("Места больше нет!");
    }

    public void remove(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
                employees[i] = null;
                return;
            }
        }
    }

    public void modify(String fio, Integer newSalary, Integer newDepartment) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].fio().equals(fio)) {
                if (newSalary != null) {
                    employees[i].setSalary(newSalary);
                }
                if (newDepartment != null) {
                    employees[i].setDepartment(newDepartment);
                }
            }
        }
    }

    public void printByDepartment() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Отдел: " + i);
            for (int j = 0; j < employees.length; j++) {
                if (employees[j].getDepartment() == i) {
                    System.out.println('\t' + employees[j].fio());
                }
            }
        }
    }

    public void printEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public int sumSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public int sumSalary(int department) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public Employee minSalary() {
        Employee min = employees[0];
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < min.getSalary()) {
                min = employee;
            }
        }
        return min;
    }

    public Employee minSalary(int department) {
        Employee min = null;
        for (Employee employee : employees) {
            if (employee == null || employee.getDepartment() != department) {
                continue;
            }
            if (min == null || employee.getSalary() < min.getSalary()) {
                min = employee;
            }
        }
        return min;
    }

    public Employee maxSalary() {
        Employee max = employees[0];
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > max.getSalary()) {
                max = employee;
            }
        }
        return max;
    }

    public Employee maxSalary(int department) {
        Employee max = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                if (max == null || employee.getSalary() > max.getSalary()) {
                    max = employee;
                }
            }
        }
        return max;
    }

    public double averageSalary() {
        return (double) sumSalary() / employees.length;
    }

    public double averageSalary(int department) {
        var sum = sumSalary(department);
        var count = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                count++;
            }
        }
        return count == 0 ? 0 : (double) sum / count;
    }

    public void printEmployeeFIO() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getLastName() + " " + employee.getFirstName() + " " + employee.getMiddleName());
            }
        }
    }


    public void indexSalary(double percent) {
        for (Employee employee : employees) {
            if (employee != null) {
                int newSalary = (int) (employee.getSalary() * (1 + percent));
                employee.setSalary(newSalary);
            }
        }
    }

    public void indexSalary(double percent, int department) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                int newSalary = (int) (employee.getSalary() * (1 + percent));
                employee.setSalary(newSalary);
            }
        }
    }

    public void print(int department) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                System.out.println(employee.getId() + " " + employee.getLastName() + " " + employee.getFirstName()
                                   + " " + employee.getMiddleName() + ". " + employee.getSalary());
            }
        }
    }

    public void printSalaryLess(int salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() < salary) {
                System.out.println(employee.info());
            }
        }
    }

    public void printSalaryGreaterOrEquals(int salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() >= salary) {
                System.out.println(employee.info());
            }
        }
    }

}
