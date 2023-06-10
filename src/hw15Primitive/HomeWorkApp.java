package hw15Primitive;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        System.out.println("\n" + checkSumSign());
        printColor();
        compareNumbers();
        System.out.println(amountWithin(-8, 20));
        printPositiveNegative(-4);
        System.out.println(positiveNegative(-5) + "\n");
        printLine("Hello", 3);
        System.out.println(leapYear(1900));
    }

    //2. Створіть метод printThreeWords(), який під час виклику повинен надрукувати в стовпець у три слова: Orange, Banana, Apple.
    private static void printThreeWords() {
        System.out.println("Orange \nBanana \nApple");
    }

    //    3. Створіть метод checkSumSign(), у тілі якого оголосіть дві int змінні a і b, та ініціалізуйте їх
//будь-якими значеннями, якими захочете. Далі метод повинен підсумувати ці змінні, і якщо їх сума більша
//або дорівнює 0, то вивести в консоль повідомлення "Сума позитивна", інакше - "Сума негативна";
    private static String checkSumSign() {
        String str;
        int a = -7;
        int b = 5;
        if (a + b >= 0) {
            str = "Введені значення: a = " + a + "; b = " + b + "\nСума позитивна";
        } else {
            str = "Введені значення: a = " + a + "; b = " + b + "\nСума негативна";
        }
        return str;
    }

    //    4. Створіть метод printColor() у тілі якого задайте int змінну value та ініціалізуйте її будь-яким
//значенням. Якщо значення менше 0 (0 включно), то в консоль метод повинен вивести повідомлення "Червоний",
//якщо лежить в межах від 0 (0 виключно) до 100 (100 включно), то "Жовтий", якщо більше 100 (100 виключно) - "Зелений";
    private static void printColor() {
        int value = 100;
        if (value <= 0) {
            System.out.println("\nЧервоний");
        } else if (value > 100) {
            System.out.println("\nЗелений");
        } else {
            System.out.println("\nЖовтий");
        }
    }

    //5. Створіть метод compareNumbers(), у тілі якого оголосіть дві int змінні a і b, та ініціалізуйте
//їх будь-якими значеннями, якими захочете. Якщо a більше або одно b, необхідно вивести в консоль
//повідомлення “a >= b”, інакше “a < b”;
    private static void compareNumbers() {
        int a = -5;
        int b = 5;
        System.out.println("\nВведені значення: a = " + a + "; b = " + b);
        System.out.println((a >= b) ? "Результат: a >= b" : "Результат: a < b");
    }

    //6. Написати метод, який приймає на вхід два цілих числа і перевіряє, що їхня сума лежить в межах
// від 10 до 20 (включно), якщо так – повернути true, інакше – false.
    private static boolean amountWithin(int a, int b) {
        System.out.println("\nСума " + a + " і " + b + " в діапазоні [10 - 20]");
        if ((a + b) >= 10 && (a + b) <= 20) return true;
        else return false;
    }

    //7. Написати метод, якому як параметр передається ціле число, метод повинен надрукувати в консоль,
//чи додатнє число передали або від’ємне. Примітка: нуль вважаємо позитивним числом.
    private static void printPositiveNegative(int a) {
        System.out.print("\nПередане число: " + a);
        System.out.println((a >= 0) ? " - додатнє." : " - від’ємне.");
    }

    //8. Написати метод, якому як параметр передається ціле число. Метод повинен повернути true, якщо число
//є негативним, і повернути false якщо позитивне.
    private static boolean positiveNegative(int a) {
        System.out.println("\nПередане число: " + a + " (якщо негативне -> true)");
        if (a >= 0) return false;
        else return true;
    }

    //9. Написати метод, якому як аргументи передається рядок і число, метод повинен надрукувати в консоль
//зазначений рядок, вказану кількість разів;
    private static void printLine(String str, int k) {
        for (int i = 1; i <= k; i++) {
            if (i != k) {
                System.out.print(str + ", ");
            } else {
                System.out.print(str + ".");
            }
        }
    }

    //10. * Написати метод, який визначає, чи є рік високосним, і повертає boolean (високосний – true, не високосний – false).
//Кожен 4-й рік є високосним, крім кожного 100-го, причому кожен 400-й – високосний.
    private static boolean leapYear(int year) {
        System.out.println("\n\n" + year + " рік високосний?");
        if ((( year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) return true;
        else return false;
    }
}
