import javax.management.MBeanAttributeInfo;
import java.sql.SQLOutput;
import java.util.Scanner;
/*
введите 2 слова, используйте сканер, состоящий из четного количества букв (проверьте количество букв в слове).
Получить слово, состоящее из первой половины первого слова и второй половины второго слова. распечатать на консоль.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the word with even numbers in letter:");
        String firstWord = sc.nextLine();
        if (firstWord.length() % 2 != 0) {
            System.out.println("The quantity letters in your word is not even! Please write again:");
            firstWord = sc.nextLine();
        }
        System.out.println("Please enter the SECOND word with even numbers in letter:");
        String secondWord = sc.nextLine();
        if (secondWord.length() % 2 != 0) {
            System.out.println("The quantity letters in your word is not even! Please write again:");
            secondWord = sc.nextLine();
        }
        String answer = firstWord.substring(0, firstWord.length() / 2) + secondWord.substring(0,
                secondWord.length() / 2);
        System.out.println(answer);
        System.out.println("----------");

    /*
    Реализовать программу, выводящую на экран результаты сложения, вычитания, умножения и деления двух чисел.
    Каждая из арифметических операций должна быть реализована как отдельный метод.
     */
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Please enter two numbers:");
        int numberForCalculator = sc2.nextInt();
        int number2ForCalculator = sc2.nextInt();
        System.out.println(Main.calculateSum(numberForCalculator, number2ForCalculator));
        System.out.println(Main.calculateDivide(numberForCalculator, number2ForCalculator));
        System.out.println(Main.calculateMultiply(numberForCalculator, number2ForCalculator));
        System.out.println(Main.calculateSubstraction(numberForCalculator, number2ForCalculator));
        System.out.println("----------");

        /*
        реализовать метод, который конвертирует указанную сумму в евро в сумму в долларах США
         */
        System.out.println("Please enter the actual exchange rate (EURO/DOLLAR) and amount money that you want " +
                "to exchange:");
        int exchangeRate = sc.nextInt();
        int amountMoneyInEURO = sc.nextInt();
        System.out.println("you get in USD: " + Main.currencyConverter(exchangeRate, amountMoneyInEURO));
        System.out.println("----------");
        /*
         * Напишите программу, которая вычисляет, сколько лишних калорий будет, если вместо пиццы диаметром 24 см вы купите
         *  пиццу диаметром 28 см. Чтобы решить эту проблему, предположим, что каждый квадратный сантиметр пиццы содержит
         *  40 калорий.
         */
        Scanner pizzaScan = new Scanner(System.in);
        System.out.println("Напишите пожалуйста какого размера пиццу Вы купили, а мы Вам сообщим \nсъедите ли Вы" +
                " лишнее калории или недоберете калории в сравнении с покупкой стандартной пиццы в 24 см. Размер пиццы" +
                " которую я слопал:");
        double square24smPizza = Math.PI * (Math.pow((24.0 / 2.0), 2.0));// S = Pi*R*R=Pi*(diametr/2)*(diametr/2)
        int pizza24InCalories = (int) (square24smPizza * 40); // калорий в пицце 24 см
        int pizzaSize = pizzaScan.nextInt();
        double squareYourPizza = Math.PI * (Math.pow((pizzaSize / 2.0), 2.0));// это площадь вашей пиццы
        int yourPizzaInCalories = (int) (squareYourPizza * 40); // кол-во калорий в вашей пицце
        int difference = Math.abs(yourPizzaInCalories - pizza24InCalories);
        if (pizza24InCalories > yourPizzaInCalories) {
            System.out.println("Вау! Вы сэкономили на калорийности " + difference + " калорий, так держать");
        }
        else if (pizza24InCalories < yourPizzaInCalories) {
            System.out.println("Упс, похоже Вы переели: "+difference+" калорий.");
        }
        else {
            System.out.println("Похоже что Вы слопали такую же пиццу как стандарт - 24см");
        }
        }
    }