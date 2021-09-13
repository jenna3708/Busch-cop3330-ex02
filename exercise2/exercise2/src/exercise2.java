import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.println("What is the input string?");
        String countInput = input.next();

        System.out.println(countInput + " has " +countInput.length()+ " characters.");
    }
}
