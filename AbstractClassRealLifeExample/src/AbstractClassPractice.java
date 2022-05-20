
    abstract class Hospitals{
        abstract void bills();
        abstract void medicines();
        abstract void caseDocuments();
    }

    class MyHospital extends Hospitals{

        @Override
        public void bills() {
            System.out.println("My Hospital's bills are ready");
        }

        @Override
        public void medicines() {
            System.out.println("My Hospital's medicines are ready");
        }

        @Override
        public void caseDocuments() {
            System.out.println("My Hospital's case documents are ready");
        }
    }

    public class AbstractClassPractice {
    public static void main(String[] args){
        Hospitals ho=new MyHospital();
        ho.bills();
        ho.caseDocuments();
        ho.medicines();

    }
}
