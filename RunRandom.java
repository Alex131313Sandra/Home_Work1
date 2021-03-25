package Home_Work1;

import java.util.*;

public class RunRandom {
    static List<Integer> numbers = new ArrayList<Integer>();
    public static void main(String[] args) {
        int max = 0;
        int min = 2;
        while (min>max) {
            max = getNumberFromConsole("Enter max number");
            min = getNumberFromConsole("Enter min number");
            if (min>max) {
                System.out.println("min must be less then max, try again");
            }
        }

        listenForCommands(max, min);

    }



    public static int getNumberFromConsole(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        while(true){
            String number = scanner.nextLine();
            try {
                int num = Integer.parseInt(number);
                if (num<0) {
                    System.out.println("Number must be positive, try again");
                    continue;
                }
                return num;
            } catch(Exception e) {
                System.out.println("You entered non valid number, try again");
            }
        }
    }

    public static void listenForCommands(int max, int min) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Enter next command:");
            String answer = scanner.nextLine();
            answer = answer.toLowerCase(Locale.ROOT);
            switch (answer) {
                case "help" :
                    help(max, min);
                    break;
                case "generate":
                    generate(max, min);
                    break;
                case "exit":
                    exit();
                    break;
                default:
                    System.out.println("You entered wrong command, please enter another command or write 'help'");
                    break;
            }

        }
    }

    public static void generate(int max, int min) {
        Random random = new Random();
        int randomNumber = random.nextInt(max + 1 - min) + min;
        while(checkIfNumberExists(randomNumber)) {
            randomNumber = random.nextInt(max + 1 - min) + min;
        }
        System.out.println("Your random number is " + randomNumber);
    }

    public static void exit() {
        System.out.println("Are you sure you want to exit? (y/n)");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        answer = answer.toLowerCase(Locale.ROOT);
        if(answer.equals("y")) System.exit(0);
    }

    public static void help(int max, int min) {
        System.out.println("If you want to generate new random number between " + min + " and "+ max+", write 'generate'");
        System.out.println("If you want to exit program, write 'exit'");
    }

    public static boolean checkIfNumberExists(int number){
        for(int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) == number) return true;
        }
        return false;
    }
}

