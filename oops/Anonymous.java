public class Anonymous {
    void print(){
        System.out.println("Any");
    }

    public static void main(String []args){
        new Anonymous().print(); // anonymous object, not stored, called once
    }
}
