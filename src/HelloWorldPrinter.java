public class HelloWorldPrinter {


    public HelloWorldPrinter() {


    }

    public void printManyTimes(int n) {
        int counter = 0;
        while(counter<n) {
            System.out.println("Hello World!");
            counter++;
        }

    }

    public void printOnce() {
        System.out.println("Hello World!");
    }

}
