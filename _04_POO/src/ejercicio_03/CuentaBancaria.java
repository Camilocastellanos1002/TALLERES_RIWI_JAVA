package ejercicio_03;

public class CuentaBancaria {
    private String titular;
    private Double balance;

    public CuentaBancaria() {
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "ejercicio_03.CuentaBancaria{" +
                "titular='" + titular + '\'' +
                ", balance=" + balance +
                '}';
    }
}
