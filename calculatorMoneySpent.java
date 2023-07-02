import java.util.Scanner;

public class calculatorMoneySpent {
    public static void main(String[] args) {
        String name;
        int moneySpent;
        double average;
        int total;
        int totalDay=7;

        Scanner input = new Scanner(System.in);
        System.out.println("Calculating your money spent!");

        System.out.println("Your name?");
        name = input.nextLine();

        System.out.println("How much money did you spend at the club on Monday?");
        moneySpent = input.nextInt();
        total = moneySpent;

        System.out.println("How much money did you spend at the club on Tuesday?");
        moneySpent = input.nextInt();
        total = total + moneySpent;
        System.out.println("How much money did you spend at the club on Wednesday?");
        moneySpent = input.nextInt();
        total = total + moneySpent;
        System.out.println("How much money did you spend at the club on Thursday?");
        moneySpent = input.nextInt();
        total = total + moneySpent;
        System.out.println("How much money did you spend at the club on Friday?");
        moneySpent = input.nextInt();
        total = total + moneySpent;
        System.out.println("How much money did you spend at the club on Saturday?");
        moneySpent = input.nextInt();
        total = total + moneySpent;
        System.out.println("How much money did you spend at the club on Sunday?");
        moneySpent = input.nextInt();
        total = total + moneySpent;

        average = (double) total/totalDay;

        System.out.println("The total result of calculating all expenses");

        System.out.println("Hay, " + name);
        System.out.println("Your total spending on the club in 1 week is " + total);
        System.out.println("With an average daily expenditure of " + average);

    }
}
