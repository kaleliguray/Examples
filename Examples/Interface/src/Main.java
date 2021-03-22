public class Main {
    public static void main(String[] args) {

        ITelephone myPhone;

        myPhone = new DeskPhone(1234214);
        myPhone.powerOn();
        myPhone.callPhone(1234214);
        myPhone.answer();

        myPhone = new MobilePhone(24454634);
        myPhone.powerOn();
        myPhone.callPhone(24454634);
        myPhone.answer();


    }
}
