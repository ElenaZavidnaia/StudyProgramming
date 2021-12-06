import Humans.Workers.Director;
import Humans.Workers.Manager;
import Humans.Workers.IpotekaManager;
import Humans.Workers.CreditManager;
import Humans.Workers.Cashier;

public class Office extends Bank {
    public String officeName;
    public String officeAddress;
    public String numberOfPersonal;
    public boolean terminalAvailability;
    public boolean bankomatAvailability;
    public String usluga; // хорошо бы завязать на класс услуга

    public Office(String bankName, String bankAddress, int bankRank,
                  String officeName, String officeAddress, String numberOfPersonal, boolean terminalAvailability, boolean bankomatAvailability, String usluga) {
        this.officeName = officeName;
        this.officeAddress = officeAddress;
        this.numberOfPersonal = numberOfPersonal;
        this.terminalAvailability = terminalAvailability;
        this.bankomatAvailability = bankomatAvailability;
        this.usluga = usluga;
    }

    public Office() {

    }

    static void getMoneyFromCustomers(Manager manager) {
        // получать деньги от клиентов
        System.out.println("КЛАДИ БАБКИ И УХОДИ");
    }

    void giveMoneyToCustomers(Manager manager) {
        // выдавать деньги клиентам
        System.out.println("БЕРИ БАБКИ И УХОДИ");
    }
}
