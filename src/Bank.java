import Humans.Workers.Director;
import Humans.Workers.Cashier;
import Humans.Workers.CreditManager;
import Humans.Workers.IpotekaManager;
import Humans.Workers.Manager;

public class Bank {
    public String bankName;
    public String bankAddress;
    public int bankRank;

    public Bank(String bankName, String bankAddress, int bankRank){
        this.bankName = bankName;
        this.bankAddress = bankAddress;
        this.bankRank = bankRank;
    }

    public Bank(){

    }
}
