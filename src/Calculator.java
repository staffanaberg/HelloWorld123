public class Calculator {

    public static void main(String[] args) {

        //Skapa ett program där en cirkels radie läses in. Cirkelns diameter, omkrets och area
        //skall beräknas och skrivas ut. (pi = 3.14)


        int a = 4;
        int x = 38;



        //Läs in en cirkels radie och spara den
        int radie = 10;

        //Räkna ut cirkelns diameter
        int diameter = 2*radie;

        double pi = 3.1415926;

        //Räkna ut cirkelns omkrets
        double omkrets = diameter*pi;

        //Räkna ut cirkelns area
        double area = pi*radie*radie;


        System.out.println("radie " + radie);
        System.out.println("diameter " + diameter);
        System.out.println("omkrets " + omkrets);
        System.out.println("area " + area);

    }
}
