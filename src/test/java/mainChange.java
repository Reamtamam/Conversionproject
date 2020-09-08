import java.util.ArrayList;
import java.util.Scanner;
//Welcome screen that allows the customer to choose the action he needs
public class mainChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to currency converter");
        Screen screen = new Screen();
        screen.info();


        COIN userCoin = screen.userCoin(scanner.nextDouble());

     //Entering the requested amount and printing an amount after including the entire amount
        System.out.println("Please enter an amount to convert");
        double result = userCoin.calculate(scanner.nextDouble());
        System.out.println(result);
        screen.end.add(result);
        screen.mainscreen(screen.end);


    }


}
