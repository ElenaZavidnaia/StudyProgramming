package Humans;

public class BankWorker extends Human {
    public String office;
    public String position;
    public String snils;
    public int workWindow;

    public BankWorker(String firstName, String lastName, String patronymic, String gender, String birthdayData, String nationality,
                      String office, String position, String snils, int workWindow){
        super(firstName, lastName, patronymic, gender, birthdayData, nationality);
        this.office = office;
        this.position = position;
        this.snils = snils;
        this.workWindow = workWindow;
    }
    public BankWorker(){

    }

}
