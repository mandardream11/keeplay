interface Member{
    public void callBack();
}


public class Store {
    Member mem[] = new Member[100];
    int count =0;

    void register(Member m){
        mem[count++]=m;
    }

    void inviteSale(){
        for (int i=0;i<count;i++){
            mem[i].callBack();
        }
    }

}

class Customer implements Member{
    String name;
    //constructor
    Customer(String n){
        name =n;
    }
    @Override
    public void callBack(){
        System.out.println("Okay, I will visit. From -"+name);
    }
}

class Main{
public static void main(String [] args){
    Store st  = new Store();
    Customer c1 =new Customer("John");
    Customer c2 = new Customer("Smith");
    st.register(c1);
    st.register(c2);
    st.inviteSale();
}
}