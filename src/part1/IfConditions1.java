package part1;

public class IfConditions1 {
    public static void main(String[] args) {

        {
            int age = 21;
            if (age >= 18) {
                System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
            } else {
                System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия");
            }
            System.out.println();
        }

        {
            int temp = 5;
            if (temp < 5) {
                System.out.println("На улице холодно, нужно надеть шапку");
            } else {
                System.out.println("Сегодня тепло, можно идти без шапки");
            }
            System.out.println();
        }

        {
            int speed = 61;
            if (speed > 60) {
                System.out.println("Если скорость " + speed + ", то придется заплатить штраф ");
            } else {
                System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
            }
            System.out.println();
        }
        {
            int age = 24;
            if (age >= 2 && age <= 6) {
                System.out.println("В сад!");
            }
            if (age >= 7 && age <= 18) {
                System.out.println("В школу!");
            }
            if (age > 18 && age <= 24) {
                System.out.println("В университет!");
            }
            if (age > 24) {
                System.out.println("На работу!");
            }
            System.out.println();
        }

        {
            int age = 6;
            boolean withParent = true;
            if (age <= 5) {
                System.out.println("Нельзя кататься");
            }
            if (withParent && age > 5 && age <= 14) {
                System.out.println("Может кататься только в сопровождении взрослого");
            }
            if (age > 14) {
                System.out.println("Может кататься без сопровождения взрослого");
            }
            System.out.println();
        }

        {
            int total = 102;
            int seats = 60;
            int place = 60;
            if (place > total) {
                System.out.println("Мест нет!");
            } else {
                if (place <= seats) {
                    System.out.println("Есть сидячее место!");
                } else {
                    System.out.println("Есть стоячее место!");
                }
            }
            System.out.println();
        }

        {
            int one = 5;
            int two = 5;
            int three = 5;
            int max;
            if (one > two) {
                max = one;
            } else {
                max = two;
            }
            if (max > three) {
                System.out.println(max);
            } else {
                System.out.println(three);
            }
            System.out.println();
        }
    }
}
