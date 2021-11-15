package src.subsystem;

import src.common.exception.PaymentException;
import src.common.exception.UnrecognizedException;
import src.entity.payment.CreditCard;
import src.entity.payment.PaymentTransaction;

public interface InterbankInterface {
    /**
     * Pay order, and then return the payment transaction
     * @param card - credit card use for payment
     * @param amount - amount to pay
     * @param contents - transaction's contents
     * @return PaymentTransaction - if the payment is successful
     * @throws PaymentException
     * @throws UnrecognizedException
     */
    public abstract PaymentTransaction payOrder(CreditCard card, int amount, String contents)
            throws PaymentException, UnrecognizedException;

    /**
     * Return, and then return the payment transaction
     * @param card - card use for refund
     * @param amount - amount of refund
     * @param contents - transaction's contents
     * @return PaymentTransaction - id the payment is successful
     * @throws PaymentException
     * @throws UnrecognizedException
     */
    public abstract PaymentTransaction refund(CreditCard card, int amount, String contents)
            throws PaymentException, UnrecognizedException;
}
