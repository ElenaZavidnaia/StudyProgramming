package Humans;

public class Customer extends Human {

    // ссылка на класс Банковская карта
    int passportSeries;
    int passportNumber;
    float ndflNalog;

    public Customer(String firstName, String lastName, String patronymic, String gender, String birthdayData, String nationality,
                    int passportSeries, int passportNumber, float ndflNalog) {
        super(firstName, lastName, patronymic, gender, birthdayData, nationality);
        this.passportSeries = passportSeries;
        this.passportNumber = passportNumber;
        this.ndflNalog = ndflNalog;
    }

    public Customer(){

    }
    void getCredit() {

    }

    void getIpoteka() {

    }

    void takeMoney() {

    }

    void giveMoney() {

    }

    void orderBankCard() {

    }

    void getBankCard() {

    }

    void pay() {

    }
}
