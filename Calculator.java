import java.util.Scanner;

class Calculator{

    public static void factorial(double inputNumber){
        int number = (int) inputNumber; 
        int fact = 1;
        int i = 1;

        while(i<=number){
            fact = fact*i;
            i++;
        }
        System.out.println("Factorial= "+ fact);
    }

    public static void calculator(){

        System.out.println("Enter first number: ");
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();

        
        System.out.println("Enter operators: (-, +, *, /) ");
        String operators = sc.next();

        
        System.out.println("Enter second number: ");
        int secondNumber = sc.nextInt();

        switch (operators) {
            case "+":
                int sum = firstNumber + secondNumber;
                System.out.println("Sum= " + sum);
                break;

             case "-":
                int sub = firstNumber - secondNumber;
                System.out.println("Sub= " + sub);
                break;    
        
             case "*":
                int multi = firstNumber * secondNumber;
                System.out.println("Multplication= " + multi);
                break;
            
             case "/":
                int div = firstNumber / secondNumber;
                System.out.println("Devision= " + div);
                break;

            default:
            System.out.println("You have entered wrong operators: Please try again ");
                break;
        }
    }

    public static void trig(){

        System.out.println("Enter value in degrees: ");
        Scanner sc = new Scanner(System.in);

        double valueInDegrees = sc.nextDouble();// 45

         System.out.println("Choose any option (sin, cos, tan)");
         String trigInput = sc.next();

        double angleRadians = Math.toRadians(valueInDegrees);

         switch(trigInput){
                case "sin":
                 double sinValue = Math.sin(angleRadians);
                 System.out.println("sin= " +sinValue);
                  break;

                case "cos":
                 double cosValue = Math.cos(angleRadians);
                 System.out.println("cos= " +cosValue);
                    break;
                
                case "tan":
                 double tanValue = Math.tan(angleRadians);
                 System.out.println("tan= " +tanValue);
                    break;
                default:
                   System.out.println("You have entered wrong input: ");
                break;
            }

    }

    public static void squareRootForThridOption(){
       
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        double inputNumber = sc.nextDouble();

        System.out.println("Enter number to find (square, square root, factorial, %, pi): ");
        String inputoperation = sc.next();

         switch(inputoperation){
                case "square":
                 double square = Math.pow(inputNumber,2);
                 System.out.println("Square= " +square);
                  break;

                case "square root":
                 double sqRoot = Math.sqrt(inputNumber);
                 System.out.println("Square root= " + sqRoot);
                    break;
                
                case "factorial":
                    factorial(inputNumber);                    
                    break;
                default:
                   System.out.println("You have entered wrong input: ");
                break;
            }

    }

    public static void main(String[] args){
    
        while(true){
            System.out.println("Welcome to Apna Calculator ");
            System.out.println("Click 1 to use Apna Calculator for arithimatic operation ");
            System.out.println("Click 2 to find  value of (sin, cos and tan) ");
            System.out.println("Click 3 to find (square, square root, factorial, %, pi) ");
            System.out.println("Click 4 to exit ");

            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();

            switch(input){
                case 1:
                  calculator();
                  break;

                case 2:
                    trig();
                    break;
                
                case 3:
                    squareRootForThridOption();
                    break;

                case 4:
                    System.exit(0);//
                    break;
                default:
                   System.out.println("You have entered wrong input: ");
                break;
            }

        }

    }

}