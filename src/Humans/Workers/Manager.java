package Humans.Workers;

import Humans.BankWorker;

public class Manager extends BankWorker {
    public Manager(String firstName, String lastName, String patronymic, String gender, String birthdayData, String nationality,
                   String office, String position, String snils, int workWindow) {
        super(firstName, lastName, patronymic, gender, birthdayData, nationality, office, position, snils, workWindow);
    }
    public Manager(){

    }

    void takeDocumentsFromCustomer() {
        // принять документы клиента
    }

    void getStatementToDirector() {
        // подать заявление
    }

    void getBankCard() {
        // выдать банковскую карту
    }
}
