// Clase principal que maneja la ejecución
package main;

import modelo.Order;
import modelo.OrderService;
import bd.Database;
import bd.DatabaseMysql;

public class OrderApp {
    public static void main(String[] args) {
        // Crear una orden con un ID y un monto
        Order order = new Order("ORD123", 250.75);

        // Crear la instancia de DatabaseMysql
        Database database = new DatabaseMysql();

        // Crear la instancia de OrderService, que se encarga de la persistencia y el reporte
        OrderService orderService = new OrderService(database);

        // Guardar la orden en la base de datos
        orderService.saveOrder(order);

        // Generar y mostrar el reporte de la orden
        String report = orderService.generateReport(order);
        System.out.println(report);
    }
}
