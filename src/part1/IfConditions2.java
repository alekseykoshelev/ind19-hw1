package part1;

public class IfConditions2 {
    public static void main(String[] args) {

        {
            int clientOS = 5;
            if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Незнакомое значение системы!");
            }
            System.out.println();
        }

        {
            int clientOS = 1;
            int deviceYear = 2016;
            if (deviceYear < 2015 && clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (deviceYear < 2015 && clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else if (deviceYear >= 2015 && clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (deviceYear >= 2015 && clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
            System.out.println();

            var osType = clientOS == 1 ? "Android" : "iOS";
            var appType = deviceYear < 2015 ? "облегченную" : "";
            System.out.println("Установите " + appType + " версию приложения для " + osType + "  по ссылке");

            System.out.println();
        }

        {
            int year = 1000;
            if (year > 1584 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
            System.out.println();
        }

        {
            int distance = 61;
            if (distance > 100) {
                System.out.println("Доставки нет!");
            } else {
                int days = 1;
                if (distance > 20) {
                    days++;
                }
                if (distance > 60) {
                    days++;
                }
                System.out.println("Количество дней: " + days);
            }
        }

        {
            int month = 6;
            switch (month) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Зима");
                    break;

                case 3:
                case 4:
                case 5:
                    System.out.println("Весна");
                    break;

                case 6:
                case 7:
                case 8:
                    System.out.println("Лето!");
                    break;

                case 9:
                case 10:
                case 11:
                    System.out.println("Осень!");
                    break;

                default:
                    System.out.println("Неизвестный месяц!");
            }
        }

    }
}
