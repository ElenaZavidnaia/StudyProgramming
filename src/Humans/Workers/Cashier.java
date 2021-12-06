package Humans.Workers;

import Humans.BankWorker;

public class Cashier extends BankWorker {
    public Cashier(String firstName, String lastName, String patronymic, String gender, String birthdayData, String nationality,
                   String office, String position, String snils, int workWindow) {
        super(firstName, lastName, patronymic, gender, birthdayData, nationality, office, position, snils, workWindow);
    }
    public Cashier(){

    }

    void getMoneyFromCustomer() {
        // получить деньги от клиента
    }

    void remitPayment() {
        // произвести оплату
    }

    void issueCheck() {
        // выдать клиенту чек
    }
}
