import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        String phone = " 960 123 45 67";
//        phone = phone.replace(" ", "");
//        phone = phone.replace("-", "");
//        phone = phone.replace("+", "");
//        if (phone.length() == 10) {
//            phone = '7' + phone;
//        } else if (phone.length() > 11) {
//            throw new RuntimeException("Неверный формат телефонного номера, слишком длинный");
//        } else if (phone.length() < 10) {
//            throw new RuntimeException("Неверный формат телефонного номера, слишком короткий");
//        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
//            throw new RuntimeException("Неверный формат телефонного номера");
//        }
//        System.out.println("phone = " + phone);
//        String expectedPhone = "79601234567";
//        if (expectedPhone.equals(phone)) {
//            System.out.println("Успешный ввод");
//        } else {
//           System.out.println("Ошибочный ввод");
        task1();
        task2();
        task3();
//        test();
    }

    public static void task1() {
        System.out.println("Задача 1");

        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov";
        String fullName = firstName + middleName + lastName;
        System.out.println("ФИО сотрудника — " + fullName);
    }

    public static void task2() {
        System.out.println("Задача 2");

        String fullName = "Ivan Ivanovich Ivanov";
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
    }

    public static void task3() {
        System.out.println("Задача 3");

        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }

//    public static void test(){
//        String apple = "gold";
//        System.out.println("apple = " + apple);
//        apple = "green";
//        System.out.println("apple = " + apple);
//
//        String s = "abcde";
//        boolean sIsBlank = s.isEmpty();
//        System.out.println(sIsBlank);
//
//        String d = "abcde";
//        boolean dEndsWith = s.endsWith("fe");
//        System.out.println(dEndsWith);
//
//        s = "My name is Ivan";
//        String[] words = s.split(" ");
//        System.out.println(Arrays.toString(words));
//
//        s = "abcd";
//        char[] c = s.toCharArray();
//        System.out.println(Arrays.toString(c));
}
