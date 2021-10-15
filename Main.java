package com.company;


public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] mas = {44, 32, 86, 19};
        System.out.println (oppositeHouse(5,46));
        System.out.println (nameShuffle("Donald Trump"));
        System.out.println (discount(89,20));
        int[] a = {10,4,1,4,-10,-50,32,2};
        System.out.println (differenceMaxMin(a));
        System.out.println (equal(3,4,3));
        System.out.println (reverseString("Hello World"));
        System.out.println (programmers(147,33,526));
        System.out.println (getXO("ooxx"));
        System.out.println (bomb("There is a bomb."));
        System.out.println (sameAscii("a","a"));
    }

    //1.Теша шел по прямой улице, по обеим сторонам которой стояло ровно n одинаковых домов.
    // Номера домов на улице выглядят так:
    // Она заметила, что четные дома увеличиваются справа, а нечетные уменьшаются слева.
    // Создайте функцию, которая принимает номер дома и длину улицы n и возвращает номер дома на противоположной стороне.
    public static int oppositeHouse (int numb, int n) {
        return (2*n+1-numb);
    }


    // 2. Создайте метод, который принимает строку (имя и фамилию человека) и возвращает строку с заменой имени и фамилии.
    public static String nameShuffle (String s) {
        String[] words = s.split(" "); //метод split делит строку на подстроки
        return String.join(" ", words[1], words[0] ); //объединяет строки
    }


    // 3. Создайте функцию, которая принимает два аргумента: исходную цену и процент скидки в виде целых чисел и
    // возвращает конечную цену после скидки.
    public static double discount(int c, int s){
        return (double) c*(100-s)/100;
    }


    // 4.Создайте функцию, которая принимает массив и возвращает разницу между наибольшим и наименьшим числами.
    public static int differenceMaxMin(int[] a){
        int max=a[0], min=a[0];
        for (int i=0; i<a.length; i++){
            if (max<a[i]){
                max=a[i];
            }
            if (min>a[i]){
                min=a[i];
            }
        }
        int result = max-min;
        return result;
    }


    // 5. Создайте функцию, которая принимает три целочисленных аргумента (a, b, c) и возвращает количество целых чисел,
    // имеющих одинаковое значение.
    public static int equal(int a, int b, int c){
        int res=0;
        if (a==b) res+=1;
        if (b==a) res+=1;
        if (b==c) res+=1;
        if (c==b) res+=1;
        if (a==c) res+=1;
        if (c==a) res+=1;

        return res;
    }


    // 6. Создайте метод, который принимает строку в качестве аргумента и возвращает
    // ее в обратном порядке.
    public static String reverseString (String s){
        return new StringBuffer(s).reverse().toString();
    }



    // 7. Вы наняли трех программистов и (надеюсь) платите им. Создайте функцию, которая
    // принимает три числа (почасовая заработная плата каждого программиста) и возвращает разницу между самым
    // высокооплачиваемым программистом и самым низкооплачиваемым.
    public static int programmers (int a, int b, int c){
        int max = a, min = a;
        if (b > max) max = b;
        if (b < min) min = b;
        if (c > max) max = c;
        if (c < min) min =c;
        return (max - min);
    }



    // 8. Создайте функцию, которая принимает строку,
    // проверяет, имеет ли она одинаковое количество x и o и возвращает либо true, либо false.
    //
    //Правила:
    //- Возвращает логическое значение (true или false).
    //- Верните true, если количество x и o одинаковы.
    //- Верните false, если они не одинаковы.
    //- Строка может содержать любой символ.
    //- Если "x" и "o" отсутствуют в строке, верните true.
    public static boolean getXO (String s) {
        int number_o = 0, number_x = 0;
        char[] s_arr = s.toCharArray();//toCharArray преобразует строку в новый массив символов
        for (int i = 0; i < s_arr.length; i++){
            if (s_arr[i] == 'o' || s_arr[i] == 'O') number_o ++;
            if (s_arr[i] == 'x' || s_arr[i] == 'X') number_x ++;
        }
        return (number_x == number_o);
    }

    //9. Напишите функцию, которая находит слово "бомба" в данной строке. Ответьте "ПРИГНИСЬ!", если найдешь, в противном случае:"Расслабься, бомбы нет".
    //Примечание:
    //Строка "бомба" может появляться в разных случаях символов (например, в верхнем, нижнем регистре, смешанном).
    public static String bomb (String s) {
        s = s.toLowerCase(); //toLowerCase преобразует символы ст роки в нижний регистр
        if (s.indexOf("bomb") != -1) return "DUCK!"; //indexOf ищет символ в строке
        else return "Relax, there's no bomb.";
    }

    //10. Возвращает true, если сумма значений ASCII первой строки совпадает с суммой значений ASCII второй строки,
    // в противном случае возвращает false.
    public static boolean sameAscii(String str1, String str2) {
        int str1_ascii = 0;
        int str2_ascii = 0;
        for (int i = 0; i < str1.length(); i++)
            str1_ascii += (int)str1.charAt(i);
        for (int i = 0; i < str2.length(); i++)
            str2_ascii += (int)str2.charAt(i);
        return str1_ascii == str2_ascii;
    }

}

