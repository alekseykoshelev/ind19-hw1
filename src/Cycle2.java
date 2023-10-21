public class Cycle2 {
    public static void main(String[] args) {

        {
            int deposit = 15_000;
            int sum = 0;
            int month = 1;
            while (sum < 2_459_000) {
                sum += (int) (sum * 1.01);
                sum += deposit;
                System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
                month++;
            }
            System.out.println();
        }

        {
            int i = 1;
            while (i < 10) {
                i++;
                System.out.print(i + " ");
            }
            System.out.println();
            for (; i > 0; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        {
            int population = 12_000_000;
            for (int year = 1; year <= 10; year++) {
                int birthRate = population / 1000 * 17;
                int deathRate = population / 1000 * 8;
                var diff = birthRate - deathRate;
                population += diff;
                System.out.println("Год " + year + ", численность населения составляет " + population);
            }
            System.out.println();
        }

        {
            int deposit = 15_000;
            int sum = deposit;
            int month = 1;
            while (sum < 12_000_000) {
                sum = sum + (sum / 100 * 7);
                System.out.println("Месяц " + month + ", сумма вклада " + sum);
                month++;
            }
            System.out.println();
        }

        {
            int deposit = 15_000;
            int sum = deposit;
            int month = 1;
            while (sum < 12_000_000) {
                sum = sum + (sum / 100 * 7);
                if (month % 6 == 0) {
                    System.out.println("Месяц " + month + ", сумма вклада " + sum);
                }
                month++;
            }
            System.out.println();
        }

        {
            int deposit = 15_000;
            for (int month = 1; month < 9 * 12; month++) {
                deposit = deposit + (deposit / 100 * 7);
                if (month % 6 == 0) {
                    System.out.println("Месяц " + month + ", сумма вклада " + deposit);
                }
            }
        }

        {
            for (int friday = 2; friday <= 31; friday += 7) {
                System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            }
            System.out.println("---------------");

            int firstFridayDay = 2;
            for (int friday = 1; friday <= 31; friday++) {
                if (friday == firstFridayDay) {
                    System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
                    firstFridayDay += 7;
                }
            }
            System.out.println("---------------");

            int friday = 2;
            while (friday <= 31) {
                System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
                friday += 7;
            }
            System.out.println();
        }

        {
            int startYear = 2023 - 200;
            int endYear = 2023 + 100;
            for (int year = startYear; year < endYear; year++) {
                if (year % 79 == 0) {
                    System.out.println(year);
                }
            }
            System.out.println("-------------");

            for (int year = 0; year < endYear; year = year + 79) {
                if (year >= startYear) {
                    System.out.println(year);
                }
            }
            System.out.println("-------------");

            int year = startYear;
            while (year < endYear) {
                if (year % 79 == 0) {
                    System.out.println(year);
                }
                year++;
            }
        }
    }
}
