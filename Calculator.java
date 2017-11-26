import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input first number:");
        double firstNum = in.nextDouble();
        System.out.println("Please input second number:");
        double secondNum  = in.nextDouble();
        while (secondNum == 0){
            System.out.println("The second number can't be zero. Please, enter nonzero number ");
            secondNum  = in.nextDouble();
        }
        System.out.println("Sum is " + (firstNum + secondNum));
        System.out.println("Difference is " + (firstNum - secondNum));
        System.out.println("Multiplication is " + (firstNum * secondNum));
        System.out.println("Division is " + (firstNum / secondNum));

    }
}
