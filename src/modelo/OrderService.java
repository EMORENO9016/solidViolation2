// Servicio que maneja la lógica de guardar la orden y generar el reporte
package modelo;

import bd.Database;

public class OrderService {
    private Database database;

    // Inyección de dependencias: se inyecta la implementación de Database
    public OrderService(Database database) {
        this.database = database;
    }

    // Método para guardar la orden en la base de datos
    public void saveOrder(Order order) {
        database.guardar(order);
    }

    // Método para generar el reporte de la orden
    public String generateReport(Order order) {
        return order.generateOrderReport();
    }
}

