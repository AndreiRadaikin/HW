import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Plz, input number:");
        int firstNum = scan.nextInt();

        System.out.println("Ur input " + firstNum + " as a first number.");
        System.out.println("Plz, input number:");
        int secondNum = scan.nextInt();

        System.out.println("Ur input " + secondNum + " as a second number.");

        int sum = firstNum + secondNum;
        System.out.println("Sum is " + sum);

        int dif = firstNum - secondNum;
        System.out.println("Dif is " + dif);

        int mult = firstNum * secondNum;
        System.out.println("Multiplication is " + mult);

        double div = (double)firstNum / secondNum;
        System.out.println("Division is " + div);

    }
}
