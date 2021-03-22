public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("ING BANK");

        if(bank.addBranch("London Chestnut")) {
            System.out.println("London Chestnut branch created");
        }

        bank.addCustomer("London Chestnut", "Tom", 80.70);
        bank.addCustomer("London Chestnut", "Michael", 200.54);
        bank.addCustomer("London Chestnut", "Beth", 400.30);

        bank.addBranch("Kimmlaut");
        bank.addCustomer("Kimmlaut", "David", 500.12);

        bank.addCustomerTransaction("London Chestnut", "Tom", 48.84);
        bank.addCustomerTransaction("London Chestnut", "Tom", 23.54);
        bank.addCustomerTransaction("London Chestnut", "Michael", 56.32);

        bank.listCustomers("London Chestnut", true);
        bank.listCustomers("Kimmlaut", true);

        bank.addBranch("Griftoon");

        if(!bank.addCustomer("Griftoon", "Daniel", 7.89)) {
            System.out.println("Error Griftoon branch does not exist");
        }

        if(!bank.addBranch("London Chestnut")) {
            System.out.println("London Chestnut branch already exists");
        }

        if(!bank.addCustomerTransaction("London Chestnut", "Brain", 52.33)) {
            System.out.println("Customer does not exist at branch");
        }

        if(!bank.addCustomer("London Chestnut", "Tom", 12.21)) {
            System.out.println("Customer Tom already exists");
        }

    }

}
