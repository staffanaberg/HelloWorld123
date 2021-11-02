public class HelloWorldPrinter {

    //Konstruktor
    public HelloWorldPrinter() {

        System.out.println("Nu är jag i HelloWorldPrinter");
        System.out.println("Nu skapar jag ett HelloWorldPrinter-objekt");

    }

    public void printManyTimes(int times) {
        int counter = 1;
        while(counter<=times) {
            System.out.println("Hello World!");
            counter = counter + 1;
        }

    }
}
