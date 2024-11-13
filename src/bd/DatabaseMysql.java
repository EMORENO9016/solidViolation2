package bd;

import modelo.Order;

public class DatabaseMysql implements Database {
    @Override
    public void guardar(Order order) {
        System.out.println("Saving Order ID: " + order.getOrderId() + " in MySQL database");
        // Aquí va la lógica para guardar la orden en la base de datos MySQL
    }
}
