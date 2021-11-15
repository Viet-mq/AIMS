package src.controller;

import src.entity.payment.CreditCard;
import src.subsystem.InterbankInterface;

import java.text.SimpleDateFormat;
import java.util.Map;

public class PaymentController extends BaseController{
    CreditCard card;
    InterbankInterface interbank;

    public Map<String, String> payOrder(int amount,
                                        String contents,
                                        String cardNUmber,
                                        String cardHolderName,
                                        String expirationDate,
                                        String securityCode){
        return null;
    }

    private String getExpirationDate(String date) {
        SimpleDateFormat formatter = new SimpleDateFormat("MMyy");
        return formatter.format(date);
    }
}
