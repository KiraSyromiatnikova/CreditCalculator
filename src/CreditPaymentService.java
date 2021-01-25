public class CreditPaymentService {
    public double calculate(double rate_year, int total, int period_month) {
        double dblResult = Math.pow(rate_year/12/100+1, period_month);
        double payment = total * rate_year/12/100 * dblResult / (dblResult - 1);
        return payment;
    }
}
