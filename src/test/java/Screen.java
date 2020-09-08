import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

//Select the conversion action that the customer wants to perform
public class Screen {
    Scanner scanner = new Scanner(System.in);
    public static ArrayList<Double>end = numberList();
    public void info() {
        System.out.println("Please choose an option (1/2)");
        System.out.println("1.Dollars to Shekels ");
        System.out.println("2. Shekels to Dollars");

    }
    //After completing one action the program before it closes will ask the customer if he wants to perform another action
    public COIN userCoin(double choice) {
        if (choice == 1) {
            return CoinFactory.getCoinInstance(EnumCoins.ILS);
        } else if (choice == 2) {
            return CoinFactory.getCoinInstance(EnumCoins.USD);
        } else {
            System.out.println("Please choose an option (1/2)");
            return userCoin(scanner.nextDouble());

        }
    }
    //Returns you to the screen to select another action
    public ArrayList<Double> back() {

        info();
        COIN userCoin = userCoin(scanner.nextDouble());
        System.out.println("Please enter an amount to convert");
        double result = (userCoin.calculate(scanner.nextDouble()));
        System.out.println(result);
        scanner.nextLine();
        end.add(result);
        mainscreen(end);
        return  end;
    }
    //An action that authorizes the customer to complete the request or proceed to another action
    public void mainscreen(ArrayList<Double> end) {
        System.out.println("Interested in performing another Y / N operation");
        String next = scanner.nextLine();
        switch (next) {
            case "y", "Y":
                back();
                break;
            case "N", "n":
                System.out.println("Thanks for using our currency converter");
                for (Double number : end){
                    System.out.println(number);
                }
                try {
                    list(end);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
        }

    }
    //At the end of the operation, the customer will print a page with the amounts after the operations are included
    public static ArrayList<Double>numberList(){
        return new ArrayList<>();
    }

    public BufferedWriter list (ArrayList<Double>mylist) throws IOException {
      BufferedWriter bufferedWriter= new BufferedWriter(new FileWriter(new File("C:\\Users\\reamt\\Desktop\\end.txt")));
      for (Double list :mylist){
          bufferedWriter.write(list.toString()+"\n");

      }
      bufferedWriter.close();
      return bufferedWriter;

    }




}

