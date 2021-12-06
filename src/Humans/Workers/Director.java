package Humans.Workers;

import Humans.BankWorker;

public class Director extends BankWorker {
   public Director(String firstName, String lastName, String patronymic, String gender, String birthdayData, String nationality,
                   String office, String position, String snils, int workWindow) {
       super(firstName, lastName, patronymic, gender, birthdayData, nationality, office, position, snils, workWindow);
    }

    public Director(){

    }
    void getComplaint() {
        // получить жалобу
    }

    void provideHelp() {
        // оказать помощь
    }
}
