public class Main {
    public static void main(String[] args) {
        int mobileAccount = 500;  //начальная сумма на счете абонента
        int payment = 1200;    // сумма пополнения
        int bonusRub;   //сумма бонусных рублей
        int totalAccount;   //итоговая сумма

        if (payment >= 1000) {
            bonusRub = payment * 1 / 100;
            totalAccount = mobileAccount + payment + bonusRub;
            System.out.println(totalAccount + " Итоговая сумма на счете абонента");
            System.out.println(bonusRub + " Сумма начисленных бонусных рублей");
        } else {
            bonusRub = 0;
            totalAccount = mobileAccount + payment + bonusRub;
            System.out.println(totalAccount + " Итоговая сумма на счете абонента");
            System.out.println(bonusRub + " Сумма начисленных бонусных рублей");
        }

    }
}
