import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        String firstName = " Ivan ";
        String middleName = " Ivanovich ";
        String lastName = " Ivanov ";
        String fullName = firstName + middleName + lastName;
        System.out.println(" ФИО сотрудника — " + fullName);
    }

    public static void task2() {
        System.out.println(" Задача 2");
        String fullName = " Ivan  Ivanovich  Ivanov ";
        String small = " Ivan  Ivanovich  Ivanov ";
        System.out.println(small.toUpperCase());
    }

    public static void task3() {
        System.out.println(" Задача 3 ");
        String fullName = " Иванов Семён Семёнович ";
        fullName = fullName.replace("ё", "е");
        System.out.println(" Данные ФИО сотрудника — " + fullName);
    }
}
