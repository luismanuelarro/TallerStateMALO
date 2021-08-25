package co.unicauca.ordermanagement.domain.states;

import co.unicauca.ordermanagement.domain.Order;

/**
 *
 * @author Luis Arroyo y Daniel Navia
 */
public class PayedStated extends OrderState {

    public PayedStated(Order order) {
        super(order);
    }

    /**
     * Descripción del estado
     *
     * @return estado
     */
    @Override
    public String getStateDescription() {
        return "Pagada";
    }

    /**
     * Metodo que enlaza la secuencia
     *
     * @param payed
     * @return
     */
    @Override
    public OrderState orderSendOut(String payed) {
        return new SendState(getOrder());
    }
}
