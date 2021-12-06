import Humans.Workers.Manager;

public class MainProgramm {

    public static void main(String[] args) {
        System.out.println();
        System.out.println();

        Manager Vasua = new Manager();

        Office vtb = new Office();

        vtb.getMoneyFromCustomers(Vasua);
    }
}
