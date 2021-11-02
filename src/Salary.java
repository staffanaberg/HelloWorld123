public class Salary {
    public static void main(String[] args) {
        //.6.En firma erbjuder sina kunder 10 procents rabatt om man vid ett inköpstillfälle handlar för
        //minst 1000 kr. Antag för enkelhetens skull att man bara handlar varor av ett visst slag. Skapa ett
        //program som beräknar vad en kund ska betala. Indata till algoritmen ska vara antalet
        //köpta enheter och priset per enhet

        int amountPhone = 12;
        int pricePerPhone = 100;

        int subTotal = amountPhone*pricePerPhone;
        int discount = 0;

        //om kostanden är minst 1000kr får man 10% rabat
        if(subTotal>=1000) {
            discount = subTotal/10;
        }

        int total = subTotal - discount;

        System.out.println(total);

    }
}
