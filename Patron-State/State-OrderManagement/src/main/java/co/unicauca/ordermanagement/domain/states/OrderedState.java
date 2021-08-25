package co.unicauca.ordermanagement.domain.states;

import co.unicauca.ordermanagement.domain.Order;

/**
 * Estado ordenado
 *
 * @author ahurtado
 */
public class OrderedState extends OrderState {

    /**
     * @param order to be processed
     */
    public OrderedState(Order order) {
        super(order);
    }

    /**
     * Descripcion del estado
     *
     * @return description
     */
    @Override
    public String getStateDescription() {
        return "Ordenada";
    }

    /**
     * Metodo que enlaza la logica
     */
    @Override
    public OrderState cancel() {
        return new CanceledState(getOrder());
    }

    /**
     * Metodo que enlaza la logica
     */
    @Override
    public OrderState orderedPayed() {
        return new PayedStated(getOrder());
    }
}
