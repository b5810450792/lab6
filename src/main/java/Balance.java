public class Balance {
    private Double total;

    public Balance() {
        this.total = 0.0;
    }

    public Double getTotal() {
        return total;
    }

    public void calculateExpense(Double moneyexpense,Double balance){
        total = balance-moneyexpense;
    }
    public void calculateIncome(Double moneyincome,Double balance){
        total = balance+moneyincome;
    }
}
