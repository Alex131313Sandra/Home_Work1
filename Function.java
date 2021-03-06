package Home_Work1;

public class Function {
    public static String getDayNameByNumber(int number) {
        if (number == 1) {
            return("Monday");
        } else if (number == 2) {
            return("Tuesday");
        } else if (number == 3) {
            return ("Wednesday");
        } else if (number == 4) {
            return ("Thursday");
        } else if (number == 5) {
            return ("Friday");
        } else if (number == 6) {
            return ("Saturday");
        } else if (number == 7) {
            return ("Sunday");
        } else if (number >= 8) {
            return ("Day number doesn't exist");
        }
   // return "null";
        return null;
    }

    public static double distanceBetweenTwoPoints(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static String getStringFromNumber (int number) {
        String[] NUMBERS_0_19 = {"ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять", "десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
        String[] TENS = {"сто", "десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};
        String[] THOUSANDS = {"тысяча", "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот"};
        String answer = "";
        if ( number < 0 || number > 999 ) {
            System.out.println("Число должно быть в диапазоне от 0 до 999");
        }
        if ( number < 20 )
            return NUMBERS_0_19[number];
        if (number > 20 && number < 100 ) {
            int tens = number / 10;
            int digit = number % 10;
            answer = TENS[tens];
            if ( digit != 0 )
                answer = answer + " " + NUMBERS_0_19[digit];
        }
        if (number > 100 && number <= 999) {
            int beginning = number / 100;
            int middle = (number%100 - number %10)/10;
            int end = number % 10;
            answer = THOUSANDS[beginning];
            if ( end != 0 )
                answer = answer + " " +TENS[middle] + " " +NUMBERS_0_19[end] ;
            return answer;
        }
        else if (number == 100) {
            answer = TENS[0] ; }

        return answer;
    }

    public static int getNumberFromString(String number) {
        String[] UNITS = {"ноль","один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
        String[] UNITS11_19 = {"одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать",
                "семнадцать", "восемнадцать", "девятнадцать"};
        String[] TENS = { "десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят",
                "восемьдесят", "девяносто"};
        String[] HUNDREDS = {"сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот",
                "восемьсот", "девятьсот"};

        String lowerCase = number.toLowerCase().trim().replaceAll("\\s+", " ");
        String[] splitNumber = lowerCase.split(" ");

        if (splitNumber[0].equals(UNITS [0])) {
            return 0;
        }
        int convertedNumber = 0;
        int wordsCounter = splitNumber.length;
        while (wordsCounter != 0) {
            for (int i = 0; i < UNITS.length-1 && wordsCounter != 0; i++) {
                if (splitNumber[splitNumber.length - wordsCounter].equals(HUNDREDS[i])) {
                    convertedNumber += (i + 1) * 100;
                    wordsCounter--;

                } else if (splitNumber[splitNumber.length - wordsCounter].equals(TENS[i])) {
                    convertedNumber += (i+1) * 10;
                    wordsCounter--;

                } else if (splitNumber[splitNumber.length - wordsCounter].equals(UNITS11_19[i])) {
                    convertedNumber += i+11;
                    wordsCounter--;

                } else if (splitNumber[splitNumber.length - wordsCounter].equals(UNITS[i])) {
                    convertedNumber += i;
                    wordsCounter--;
                }
            }
        }
        return convertedNumber;
    }
}

