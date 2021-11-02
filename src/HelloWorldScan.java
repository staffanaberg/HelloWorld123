import java.util.Scanner;

public class HelloWorldScan {

    //private int secondNumber;

    public static void main(String[] args) {

        int firstNumber = 10;

        int secondNumber = 0;

        if(firstNumber > 1) {
            //int secondNumber = 10;
            System.out.println(secondNumber);
            System.out.println(firstNumber);
        }

        System.out.println(firstNumber);
        System.out.println(secondNumber);

        //Create scanner to be able to get input
        Scanner scan = new Scanner(System.in);



        //Wait until we get text/number
        //String text = scan.nextLine();
        int number = Integer.parseInt(scan.nextLine());

        //Print text/number
        System.out.println(number*number);
        //System.out.println(text);

  }
}

