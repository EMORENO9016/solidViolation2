// Implementación concreta para MySQL
package bd;

import modelo.Order;

public class DatabaseMysql implements Database {
    @Override
    public void guardar(Order order) {
        System.out.println("Order with ID " + order.getOrderId() + " saved in MySQL database.");
    }
}
