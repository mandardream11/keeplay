public class PropertiesAndConstructor {

    public class Product{
        private String itemno;
        private String name;
        private double price;
        private short qty;

        public String getItemno() {
            return itemno;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getQty() {
            return qty;
        }

        public void setQty(short qty) {
            this.qty = qty;
        }

        Product(String itemno){}
        Product(String itemno,String name){}
        Product(String itemno, String name, double price){}
        Product(String itemno, String name, double price, short qty){}

    }

    public class Customer
    {
        private String custId;
        private String name;
        private String address;
        private String phno;

        public String getCustId() {
            return custId;
        }

        public String getName() {
            return name;
        }

        public String getAddress() {
            return address;
        }

        public String getPhno() {
            return phno;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void setPhno(String phno) {
            this.phno = phno;
        }
        Customer(String custId){}
        Customer(String custId,String name){}
        Customer(String custId,String name,String address){}
        Customer(String custId,String name,String address, String phno){}
    }
}
