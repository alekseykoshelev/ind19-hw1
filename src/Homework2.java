public class Homework2 {
    public static void main(String[] args) {

        int variable1 = 15412;
        byte b = 78;
        short s = 5643;
        long l = 1249871L;
        float f = 3.2f;
        double d = 6.2d;
        System.out.println("Значение переменной " + variable1 + " с типом равно");
        System.out.println("Значение переменной " + b + " с типом равно");
        System.out.println("Значение переменной " + s + " с типом равно");
        System.out.println("Значение переменной " + l + " с типом равно");
        System.out.println("Значение переменной " + f + " с типом равно");
        System.out.println("Значение переменной " + d + " с типом равно");
        System.out.println();

        double d1 = 27.12;
        long l1 = 987_678_965_549L;
        float f1 = 2.786f;
        int i = 569;
        short s1 = -159;
        short s2 = 27897;
        byte b1 = 67;

        System.out.println();
        int luda = 23;
        int anna = 27;
        int katya = 30;
        int paperCount = 480;
        int paperPerStudent = paperCount / (luda + anna + katya);
        System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги");

        System.out.println();
        int perMin = 16 / 2;
        int per20Min = perMin * 20;
        int perDay = perMin * 60 * 24;
        int per3Day = perDay * 3;
        int perMonth = perDay * 30;
        System.out.println("За 20 минут машина произвела " + per20Min + " штук бутылок");
        System.out.println("За день машина произвела " + perDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + per3Day + " штук бутылок");
        System.out.println("За месяц машина произвела " + perMonth + " штук бутылок");

        System.out.println();
        int brownJarPerClass = 4;
        int whiteJarPerClass = 2;
        int totalJars = 120;
        int classCount = totalJars / (brownJarPerClass + whiteJarPerClass);
        System.out.println("В школе, где " + classCount + " классов, нужно " + (whiteJarPerClass * classCount)
                + " банок белой краски и " + (brownJarPerClass * classCount) + " банок коричневой краски");

        System.out.println();
        int bananas = 5 * 80;
        double milk = 105 * 2;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;
        double total = eggs + iceCream + milk + bananas;
        System.out.println(total + " гр.");
        double inKg = total / 1000;
        System.out.println(inKg + " кг.");
        System.out.println();

        int maxGramsPerDay = 500;
        int minGramsPerDay = 250;
        int weight = 7000;
        int minDays = weight / maxGramsPerDay;
        int maxDays = weight / minGramsPerDay;
        System.out.println(minDays);
        System.out.println(maxDays);
        System.out.println((maxDays + minDays) / 2);

        System.out.println();
        double masha = 67_760;
        double denis = 83_690;
        double kris = 76_230;

        double increasedMasha = masha * 1.1;
        double increasedDenis = denis * 1.1;
        double increasedKris = kris * 1.1;

        double mashaYear = masha * 12;
        double denisYear = denis * 12;
        double krisYear = kris * 12;

        double increasedMashaYear = increasedMasha * 12;
        double increasedDenisYear = increasedDenis * 12;
        double increasedKrisYear = increasedKris * 12;
        System.out.println("Маша теперь получает " + increasedMasha + " рублей. "
                + "Годовой доход вырос на " + (increasedMashaYear - mashaYear) + " рублей");

    }
}
