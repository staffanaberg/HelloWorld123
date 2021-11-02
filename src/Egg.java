import java.util.Scanner;

public class Egg {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String myString = scan.nextLine();

        if (myString.equals("ägg")) {
            System.out.println("Ägg är knasigt");
        } else {
            for (int i = 0; i < myString.length(); i++) {
                System.out.println(myString.charAt(i));

            }
        }
    }
}
