package src.subsystem;

import src.entity.payment.CreditCard;
import src.entity.payment.PaymentTransaction;

public class InterbankSubsystem implements InterbankInterface{
    @Override
    public PaymentTransaction payOrder(CreditCard card, int amount, String contents) {
        return null;
    }

    @Override
    public PaymentTransaction refund(CreditCard card, int amount, String contents) {
        return null;
    }
}
