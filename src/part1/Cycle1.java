package part1;

public class Cycle1 {

    public static void main(String[] args) {

        {
            for (int i = 1; i <= 10; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        {
            for (int i = 10; i > 0; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        {
            for (int i = 0; i < 17; i += 2) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        {
            for (int i = 10; i >= -10; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        {
            for (int year = 1904; year <= 2096; year = year + 4) {
                System.out.println(year + " год является високосным");
            }
            System.out.println();
        }

        {
            // 7 14 21 28 35 42 49 56 63 70 77 84 91 98
            for (int i = 7; i <= 98; i += 7) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        {
            // 1 2 4 8 16 32 64 128 256 512
            for (int i = 1; i <= 512; i = i * 2) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        {
            int deposit = 29_000;
            int sum = 0;
            for (int month = 1; month <= 12; month++) {
                sum += deposit;
                System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + "  рублей");
            }
            System.out.println();
        }

        {
            int deposit = 29_000;
            int sum = 0;
            for (int month = 0; month < 12; month++) {
                sum += (int) (sum * 1.01);
                sum += deposit;
                System.out.println("Месяц " + (1 + month) + ", сумма накоплений равна " + sum + " рублей");
            }
            System.out.println();
        }

        {
            for (int i = 1; i <= 10; i++) {
                System.out.println("2 * " + i + " = " + i * 2);
            }
            System.out.println();
        }

    }
}
