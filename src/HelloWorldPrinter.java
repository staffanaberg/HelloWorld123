public class HelloWorldPrinter {


    public HelloWorldPrinter() {


    }

    public void printManyTimes(int times) {
        int counter = 1;
        while(counter<=times) {
            System.out.println("Hello World!");
            counter = counter + 1;
        }

    }

    public void printOnce() {
        System.out.println("Hello World!");
    }

}
