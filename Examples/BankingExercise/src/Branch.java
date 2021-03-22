import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name){
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName(){
        return name;
    }

    public ArrayList<Customer> getCustomers(){
        return customers;
    }

    private Customer findCustomer(String customerName){
        for (int i=0; i<this.customers.size();i++){
            Customer checkedCustomer = this.customers.get(i);
            if (checkedCustomer.getName().equals(customerName)){
                //System.out.println("Founded customer");
                return checkedCustomer;
            }
        }
        //System.out.println("Customer did not find");
        return null;
    }

    public boolean newCustomer(String customerName, double initialTransaction){
        if (findCustomer(customerName) == null){
            System.out.println("New Customer is been creating");
            this.customers.add(new Customer(customerName,initialTransaction));
            return true;
        }
        System.out.println("Customer is existed");
        return false;
    }

    public boolean addCustomerTransaction(String customerName,double amount){
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null){
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }



}



















