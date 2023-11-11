package part1;

public class Methods {
    public static void main(String[] args) {

        // ASCII

        printLeapYear(12311);
        printLeapYear(11222);
        printLeapYear(2000);
        printLeapYear(2056789);

        printAppVersion(823, 22);
        printAppVersion(2019, 22);


        if (isLeapYear(2000)) {
            System.out.println("Год високосный");
        }

        var days = calculateDeliveryTime(222);
        if (days == -1) {
            System.out.println("Доставки нет!");
        } else {
            System.out.println("Количество дней: " + days);
        }
    }

    public static void printLeapYear(int year) {
        if (year > 1584 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static boolean isLeapYear(int year) {
        return year > 1584 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }


    private static void printAppVersion(int deviceYear, int clientOS) {
        if (deviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (deviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (deviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (deviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static int calculateDeliveryTime(int distance) {
        if (distance > 100) {
            return -1;
        } else {
            int days = 1;
            if (distance > 20) {
                days++;
            }
            if (distance > 60) {
                days++;
            }
            return days;
        }
    }
}
