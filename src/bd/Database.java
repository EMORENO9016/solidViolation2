package bd;
// Interfaz para la persistencia de datos
import modelo.Order;

public interface Database {
    void guardar(Order order);
}
