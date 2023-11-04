import java.util.Locale;

public class Strings {
    public static void main(String[] args) {

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);


        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — "
                           + (lastName + " " + firstName + " " + middleName).toUpperCase());
        System.out.println();

        var fullName2 = "Ёванов Семён Семёнович";
        var replaced = fullName2.replace('ё', 'е').replace('Ё', 'Е');
        System.out.println(fullName2);
        System.out.println("Данные Ф. И. О. сотрудника — " + replaced);

    }
}
