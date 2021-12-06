package Humans.Workers;

import Humans.BankWorker;

public class IpotekaManager extends BankWorker {
    public IpotekaManager(String firstName, String lastName, String patronymic, String gender, String birthdayData, String nationality,
                          String office, String position, String snils, int workWindow){
        super(firstName, lastName, patronymic, gender, birthdayData, nationality, office, position, snils, workWindow);

    }
    public IpotekaManager(){

    }
    void takeIpotecaDocumentsFromCustomer() {
        // принять документы клиента
    }

    void getIpotekaStatementToDirector() {
        // передать заявление клиента на рассмотрение управляющему
    }

    void getIpotekaSolution() {
        // выдать клиенту результат рассмотрения заявки
    }
}
