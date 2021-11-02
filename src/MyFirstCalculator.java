import java.util.Scanner;

public class MyFirstCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int first = Integer.parseInt(scan.nextLine());
        int second = Integer.parseInt(scan.nextLine());

        MyCalculator calc = new MyCalculator(first, second);

    }

}
