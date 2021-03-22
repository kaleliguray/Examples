package vipPersonExample;

public class Driver {
    public static void main(String[] args) {

        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName() + " " + person1.getCreditLimit() + " " + person1.getEmailAddress());

        VipPerson person2 = new VipPerson("Jack",25000.00);
        System.out.println(person2.getName() + " " + person2.getCreditLimit() + " " + person2.getEmailAddress());

        VipPerson person3 = new VipPerson("Mike",100000.00,"mike@email.com");
        System.out.println(person3.getName() + " " + person3.getCreditLimit() + " " + person3.getEmailAddress());

    }

}




























