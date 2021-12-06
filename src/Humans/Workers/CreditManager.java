package Humans.Workers;

import Humans.BankWorker;

public class CreditManager extends BankWorker {
    public CreditManager(String firstName, String lastName, String patronymic, String gender, String birthdayData, String nationality,
                          String office, String position, String snils, int workWindow){
        super(firstName, lastName, patronymic, gender, birthdayData, nationality, office, position, snils, workWindow);

    }
    public CreditManager(){

    }
    void takeCreditDocumentsFromCustomer() {
        // принять документы клиента
    }

    void getCreditStatementToDirector() {
        // передать заявление клиента на рассмотрение управляющему
    }

    void getCreditSolution() {
        // выдать клиенту результат рассмотрения заявки
    }
}
