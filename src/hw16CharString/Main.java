package hw16CharString;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ServiceSeachEtc serviceSeachEtc = new ServiceSeachEtc();
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.println("\nВиберіть завдання:");
            System.out.println("1 - Рядок і символ.\n" +
                    "2 - Два рядки (source, target)\n" +
                    "3 - Реверс (Hello -> olleH)\n" +
                    "4 - Паліндром\n" +
                    "5 - Вгадай слово\n" +
                    "0 - Вихід");
            num = scanner.nextInt();
            switch (num) {
                case 1 -> {
                    String str = "StrStringing";
                    char ch = 's';
                    int count = serviceSeachEtc.findSymbolOccurance(str, ch);
                    System.out.println((count != 0) ? "Символ '" + ch + "' зустрічається " + count + " раз\n" :
                            "Символ '" + ch + "' відсутній\n");
                }
                case 2 -> {
                    String str = "StrStringing";
                    String target = "string";
                    System.out.println(" зустрічається з " + serviceSeachEtc.findWordPosition(str, target) + " індексу \n");
                }
                case 3 -> {
                    String str = "StrStringing";
                    System.out.println(str + " - її реверс:\n" + serviceSeachEtc.stringReverse(str));
                }
                case 4 -> {
                    String str = "Erdffdre";
//                    str = "Allo";
//                    str = "Ere";
                    System.out.println("\nВведене " + str + " є поліндром?\n" + serviceSeachEtc.isPalindrome(str));
                }
                case 5 -> {
                    scanner.nextLine();
                    Task6GuessWord task6 = new Task6GuessWord();
                    String s1 = task6.word();
                    String enteredWord;
                    System.out.println("Загадане :-) " + s1);
                    String str;
                    do {
                        System.out.println("Введіть слово: ");
                        str = task6.gewWord(scanner);
                        enteredWord = task6.searchWord(str, s1);
                        System.out.println(enteredWord);
                    } while (!enteredWord.equals(s1));
                    System.out.println("Чудово, ви вгадали слово!");
                }
                case 0 -> scanner.close();
            }
        } while (num != 0);
    }

}
