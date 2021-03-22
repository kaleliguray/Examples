import java.util.Scanner;

public class Driver {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("03218579783");

    public static void main(String[] args) {

        boolean exit = false;
        startPhone();
        printAction();

        while(!exit){
            System.out.print("\nEnter action: (6 to show available actions) ");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("\nShutting down... ");
                    exit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printAction();
                    break;
            }

        }

    }

    private static void printAction(){
        System.out.println("\nAvaliable actions:\npress");
        System.out.println("0 - to shutdown\n"+
                           "1 - to print contacts\n"+
                           "2 - to add new contact\n"+
                           "3 - to update an existing contact\n"+
                           "4 - to remove an existing contact\n"+
                           "5 - query if an existing contact exists\n"+
                           "6 - to print a list of available actions.");
        System.out.println("Choose your action: ");
    }

    private static void startPhone(){
        System.out.println("Starting phone ...");
    }

    private static void addNewContact(){
        System.out.print("Enter new contact name : ");
        String name = scanner.nextLine();
        System.out.print("Enter phone number : ");
        String phone = scanner.nextLine();
        Contact contact = Contact.createContact(name,phone);
        if (mobilePhone.addNewContact(contact)){
            System.out.println("New contact added: name = " + name + ", phone = " + phone);
        } else {
            System.out.println("Cannot add, " + name + " already on file");
        }
    }

    private static void updateContact(){
        System.out.print("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null){
            System.out.println("Contact not found");
            return;
        }

        System.out.print("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter new contact phone number: ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName,newNumber);
        if (mobilePhone.updateContact(existingContactRecord,newContact)){
            System.out.println("Successfully updated record.");
        } else {
            System.out.println("Error updating record.");
        }
    }

    private static void removeContact(){
        System.out.print("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }
        if (mobilePhone.removeContact(existingContactRecord)){
            System.out.println("Successfully deleted");
        } else {
            System.out.println("Error deleting contact");
        }
    }

    private static void queryContact(){
        System.out.print("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null){
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Name: " + existingContactRecord.getName() + " phone number: " + existingContactRecord.getPhoneNumber());
    }

}






































