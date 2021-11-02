public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Nu är jag i HelloWorld");

        HelloWorldPrinter hwp = new HelloWorldPrinter();

        System.out.println("Nu är jag i HelloWorld igen");
        System.out.println("Först 3 ggr");
        hwp.printManyTimes(3);
        System.out.println("Sen 4 ggr");
        hwp.printManyTimes(4);

    }

}
