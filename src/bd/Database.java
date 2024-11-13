// Interface para la persistencia
package bd;

import modelo.Order;

public interface Database {
    void guardar(Order order);
}
