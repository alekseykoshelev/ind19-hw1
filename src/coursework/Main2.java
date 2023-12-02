package coursework;

public class Main2 {
    public static void main(String[] args) {

        EmployeeBook book = new EmployeeBook(10);
        book.add(new Employee("name1", "middle1", "last1", 1000, 1));
        book.add(new Employee("name2", "middle2", "last2", 11000, 3));
        book.add(new Employee("name3", "middle3", "last3", 12000, 1));
        book.add(new Employee("name4", "middle4", "last4", 14000, 5));
        book.add(new Employee("name5", "middle5", "last5", 111000, 1));
        book.add(new Employee("name6", "middle6", "last6", 9000, 4));
        book.add(new Employee("name7", "middle7", "last7", 12000, 2));
        book.add(new Employee("name8", "middle8", "last8", 15000, 2));
        book.add(new Employee("name9", "middle9", "last9", 7865, 3));
        book.add(new Employee("name10", "middle10", "last10", 213111, 1));

        book.printByDepartment();
        System.out.println("------");
        System.out.println(book.sumSalary());
        System.out.println("------");
        var emp = new Employee("name1", "middle1", "last1", 1000, 1);

        book.modify(emp.fio(), null, 4);
        book.printEmployees();
        System.out.println("------");
        book.remove(10);
        book.printEmployees();
        System.out.println("------");
        System.out.println(book.sumSalary());
        System.out.println("------");
        book.add(new Employee("name11", "middle11", "last11", 100012111, 5));
        System.out.println("------");
        book.printEmployees();
        System.out.println("------");
        book.remove(5);
        book.add(new Employee("name12", "middle12", "last12", 100012111, 5));
        book.printEmployees();


    }
}
