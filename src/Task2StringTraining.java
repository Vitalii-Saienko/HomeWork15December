public class Task2StringTraining {
    /*
    1 Создайте строку через new - I study Basic Java!
2 Напишите метод, который принимает в качестве параметра строку, передайте в этот метод строку, которую создали в п.1
3 Распечатать последний символ строки. Используем метод String.charAt().
4 Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
5 Заменить все символы “а” на “о”.
6 Преобразуйте строку к верхнему регистру.
7 Преобразуйте строку к нижнему регистру.
8 Вырезать строку Java c помощью метода String.substring().
     */
    public static void main(String[] args) {
        String myString = new String("I study Basic Java!"); //task1
        String newString = iTakeAString(myString); //task2
        System.out.println(myString.charAt((myString.length())-1)); //task3
        System.out.println((newString.contains("Java")) ? "да, содержит" : "нет, не содержит");//task4
        String myChangedString = myString.replace("a", "o");//task5
        System.out.println(myChangedString);
        System.out.println(myString.toUpperCase());//task6
        System.out.println(myString.toLowerCase());//task7
        System.out.println(myString.substring(myString.indexOf("J"),(myString.length()-1)));//task8
    }
    public static String iTakeAString (String a){ //task2
        return a;
    }
}
