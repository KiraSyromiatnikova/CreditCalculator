public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();
        double payment = service.calculate(9.99, 1000000, 12);
       System.out.println(payment);
    }
}