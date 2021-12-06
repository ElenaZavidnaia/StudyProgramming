import Humans.Workers.CreditManager;
import Humans.Workers.Manager;

public class MainProgramm {

    public static void main(String[] args) {
        Bank vtb = new Bank("ВТБ", "г.С.-Петербург, Дегтяревый переулок, 11", 2);

        Office chebRoo = new Office("ВТБ","г.С.-Петербург, Дегтяревый переулок, 11", 2, "РОО «Чебоксарский»",
                " г. Чебоксары, бульвар Президентский, д. 27А", "1000", true,true,"Все виды услуг");

        Manager andrey = new Manager("Андрей", "Петров", "Николаевич",
                "male", "15.08.1996", "russian", "24-й региональный", "ИО начальника отдела ипотеки всея Руси", "111-111-11",
                666);


        chebRoo.giveMoneyToCustomers(andrey);
    }
}
