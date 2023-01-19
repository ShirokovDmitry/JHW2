// 1. Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
// 2. Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
// 3. *Напишите программу, чтобы перевернуть строку с помощью рекурсии.
// 4. Дано два числа, например 3 и 56, необходимо составить следующие строки: 
//    3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
// 5. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
// 6. *Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
// 7. **Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.


package Java.HW.HW2;

public class Main {
    public static void main(String[] args) {
        String str1 = "dslkd";
        String str2 = "dslkd";
        compars(str1, str2);
        // 3. *Напишите программу, чтобы перевернуть строку с помощью рекурсии.
        revStr(str1, new StringBuilder(str2).reverse().toString());
        int a = 3;
        int b = 56;
        matBild(a, b);

    }


    public static void compars(String str1, String str2) {
        System.out.println(str1.contains(str2));
    }

    public static void revStr(String str1, String str2) {
        System.out.println(str1.contains(str2));
    }

    // 4. Дано два числа, например 3 и 56, необходимо составить следующие строки: 
    //    3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
    public static void matBild(int a, int b) {
        StringBuilder srtBd = new StringBuilder();
        srtBd.append(String.format("%d + %d = %d\n", a, b, a + b));
        srtBd.append(String.format("%d - %d = %d\n", a, b, a - b));
        srtBd.append(String.format("%d * %d = %d\n", a, b, a * b));

        System.out.println(srtBd.toString());

        // 5. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
        srtBd.deleteCharAt(7);
        srtBd.deleteCharAt(18);
        srtBd.insert(18,"равно");

        System.out.println(srtBd.insert(7,"равно"));

        // 6. *Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
        // 7. **Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.
        double begin1 = System.currentTimeMillis();
        System.out.println(srtBd.toString().replaceAll("=", "равно"));
        System.out.println(System.currentTimeMillis() - begin1);

        double begin = System.currentTimeMillis();
        String str = "=";
        for(int i = 0; i < 10000; i++){
            str += Character.getName(i);
        }
        System.out.println(System.currentTimeMillis() - begin);

        begin = System.currentTimeMillis();
        StringBuilder strBil = new StringBuilder("=");
        for(int i = 0; i < 10000; i++){
            strBil.append(Character.getName(i));
        }
        System.out.println(System.currentTimeMillis() - begin);
    }


    

}
