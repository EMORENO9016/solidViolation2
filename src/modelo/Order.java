package modelo;

public class Order {
    private String orderId;
    private double amount;

    // Constructor
    public Order(String orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
    }

    // Métodos getters
    public String getOrderId() {
        return orderId;
    }

    public double getAmount() {
        return amount;
    }

    // Método para generar el reporte
    public String generateOrderReport() {
        return "Report for Order ID: " + orderId + " with amount: " + amount;
    }
}
