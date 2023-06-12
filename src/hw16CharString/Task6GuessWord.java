package hw16CharString;

import java.util.Scanner;

public class Task6GuessWord {
//6. * Створити масив зі слів String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado" ,
//"broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut",
//"olive", " pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
//При запуску програми комп'ютер загадує слово, запитує відповідь у користувача,
//порівнює його із загаданим словом та повідомляє чи правильно відповів користувач. Якщо слово не вгадано,
//комп'ютер показує літери, які стоять на своїх місцях.
//apple – загадане
//apricot - відповідь гравця
//ap############# (15 символів, щоб користувач не міг дізнатися довжину слова)
//Для порівняння двох слів посимвольно, можна скористатися:
//String str = "apple";
//str.charAt(0); - метод, поверне char, який стоїть у слові str на першій позиції
//Граємо до тих пір, поки гравець не відгадає слово
//Використовуємо лише маленькі літери
//ВАЖЛИВО: Під час роботи із завданням використовувати класи:
//- java.util.Scanner для введення інформації через консоль
//https: //docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Scanner.html
//- java.util.Random для генерації випадкових чисел (індексів)
//https://docs. oracle.com/en/java/javase/17/docs/api/java.base/java/util/Random.html

    String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
            "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut",
            "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

    String word() {
        return words[(int) (Math.random() * words.length)];
    }

    String gewWord(Scanner scanner) {
        return scanner.nextLine();
    }

    String searchWord(String enteredWord, String target) {
        String codingWord = "###############";
        char[] charsCodingWord= codingWord.toCharArray();

        int maxNumberCharsGuess;

        char[] charTarget = target.toCharArray();
        char[] charEnteredWord = enteredWord.toCharArray();
            maxNumberCharsGuess = 0;
//            цикл по буквам кожного слова
            for (int i = 0; i < charEnteredWord.length && i < charTarget.length; i++) {
                if (charEnteredWord[i] == charTarget[i]) {
//лічильник максимально вгаданих букв
                    maxNumberCharsGuess++;
//                    Замінити вгадану букву
                    charsCodingWord[i] = charEnteredWord[i];
//                    Якщо лічильник співпадає з кількістю букв у слові, то вгадали )
                    if (maxNumberCharsGuess == charEnteredWord.length) {
                        codingWord = String.valueOf(charsCodingWord).replace('#', ' ');
                        return codingWord.trim();
                    }
                }
            }
        System.out.println("\nСпробуйте ще раз. Кількість вгаданих.");
        return String.valueOf(charsCodingWord);
    }
}
