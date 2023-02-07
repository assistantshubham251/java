import java.util.Scanner;
public class Calculator {
    public static void main(String args[]){
        char operator;
        Double number1 , number2 , result;

        Scanner input = new Scanner(System.in);  // create an object of Scanner class


        System.out.println("Enter First Number");    //ask user to enter number
         number1 = input.nextDouble();

        System.out.println("Enter Second Number");   // ask user to enter number
        number2 = input.nextDouble();


        System.out.println("choose an operator: +, -, *, or /"); //ask user to enter operator
        operator = input.next().charAt(0);


        switch(operator){
            // performs addition between numbers
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;
            // performs subtraction between numbers
            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;
            // performs multiplication between numbers
            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;
            // performs division between numbers
            case '/':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;
            default:
                System.out.println("Invalid operator!");
                break;
        }












    }

}
