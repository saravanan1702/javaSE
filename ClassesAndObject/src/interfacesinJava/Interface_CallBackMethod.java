package interfacesinJava;

import java.util.Scanner;

interface Members {
    void callback();
}

class Customer implements Members {
    String name;

    Customer(String name) {
        this.name = name;
    }

    @Override
    public void callback() {
        System.out.println("ok i will come " + name);
    }

}

class Store {
    //we can't creat object for interfaces but can create array of object
    Members members[] = new Members[100];//creating member interface for array of object
    int count = 0;

    void register(Members x) {
        members[count++]=x;
    }

    void inviteSale() {
        for (int i = 0; i < count; i++) {
            members[i].callback();
        }

    }
}

public class Interface_CallBackMethod {
    public static void main(String[] args) {
        //create object for store
        Store s = new Store();
        //create object for customer
        Customer c1 = new Customer("Saravanan");
        Customer c2 = new Customer("Jasmine");
        Customer c3 = new Customer("Meow");
        Customer c4=new Customer("Queeny");
        s.register(c1);
        s.register(c2);
        s.register(c3);
        s.register(c4);
        System.out.println("number of Customer count is :" + s.count);
        s.inviteSale();


    }
}
