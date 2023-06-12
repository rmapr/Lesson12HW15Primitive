package hw16CharString;

public class ServiceSeachEtc {

    //2. Створити метод findSymbolOccurance. Метод приймає як параметр рядок і символ. Необхідно обчислити,
//скільки разів символ зустрічається в переданому рядку і повернути це числове значення.
    int findSymbolOccurance(String str, char ch) {
        int count = 0;
        System.out.println("Рядок: " + str);
        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) == ch) count++;
        }
        return count;
    }

    //3. Створити метод findWordPosition. Метод приймає як параметри два рядки (source, target). Необхідно
//з'ясувати, чи є target (підрядок) частиною рядка source. Якщо так, тоді повернути номер позиції (індекс)
//першого елемента підрядка у рядку, інакше повернути -1.
//Приклад 1:
//Source: Apollo
//Target: pollo
//Result: 1
//Приклад 2:
//Source: Apple
//Target: Plant
//Result: -1
    int findWordPosition(String source, String target) {
        System.out.print(source + "\n" + target);
        if (source.toLowerCase().contains(target.toLowerCase())) {
            return source.toLowerCase().indexOf(target.toLowerCase());
        } else return -1;
    }

    //4. Створити метод stringReverse. Метод приймає як параметр - рядок. Необхідно її розгорнути та повернути змінений варіант.
//Наприклад:
//Hello -> olleH
    String stringReverse(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(str.length() - i - 1);
        }
        return new String(chars);
    }

    //5. Створити метод isPalindrome. Метод приймає як параметр - рядок. Необхідно Перевірити, чи є переданий
//рядок паліндромом. Якщо так, тоді повернуть true, інакше false.
//Приклад 1:
//ERE -> true
//Приклад 2:
//Allo -> false
    boolean isPalindrome(String str) {
        char[] chars = str.toLowerCase().toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] == chars[chars.length - 1 - i]) {
                count++;
            } else {
                return false;
            }
        }
        if (count == chars.length / 2) return true;
        else return false;
    }
}
