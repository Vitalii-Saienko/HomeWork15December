public class NumbersConverting {
    public static void main(String[] args) {
        //Перевести число 333 из шестнадцатиричной в десятичную
        System.out.println("Task0:");
        String hexNumber = "333";
        int decimalNumber = Integer.parseInt(hexNumber, 16);
        System.out.println("hexNumber "+hexNumber+" in decimal format is: "+ decimalNumber);
        System.out.println("---------------------");

        //Разложить число 200345 на разряды в десятичной системе
        int number = 200345;
        System.out.println("Task1. Number "+number+" has following ranks:");
        String firstRank = number%10+" *1";
        String secondRank = ((number/10)%10)+" *10";
        String thirdRank = ((number/100)%10)+" *100";
        String fourthRank = ((number/1000)%10)+" *1000";
        String fifthRank = ((number/10000)%10)+" *10000";
        String sixthRank = ((number/100000)%10)+" *100000";
        System.out.println(firstRank);
        System.out.println(secondRank);
        System.out.println(thirdRank);
        System.out.println(fourthRank);
        System.out.println(fifthRank);
        System.out.println(sixthRank);

        // Перевести 637 из десятичной в шестнадцатиричную и обратно (10->16 и 16->10)
        System.out.println("---------------------");
        System.out.println("Task 2. Convert 637 from decimal to 16th and back:");
        int deciNumber = 637;
        String hex = Integer.toHexString(deciNumber);
        System.out.println(hex);
        int decimalNumber2 = Integer.parseInt(hex, 16);
        System.out.println(decimalNumber2);
        System.out.println("---------------------");

        // Перевести 637 из десятичной в двоичную
        System.out.println("Task 3. Convert 637 from decimal to binary:");
        int number2 = 637;
        String decimalInBinary = Integer.toBinaryString(number2);
        System.out.println(decimalInBinary);
        System.out.println("---------------------");

        //11100111 перевести в десятичную
        System.out.println("Task 4. Convert 11100111 from binary to decimal:");
        String numberInBinary = "11100111";
        int decimalNumber3 = Integer.parseInt(numberInBinary, 2);
        System.out.println(decimalNumber3);
        System.out.println("---------------------");

        //Перевести 637 из десятичной в троичную
        System.out.println("Task 5. Convert 637 from decimal to three-rank format:");
        int decimalNumber4 = 637;
        String threeRankNumber = Integer.toString(decimalNumber4, 3);
        System.out.println(threeRankNumber);
    }
    }
