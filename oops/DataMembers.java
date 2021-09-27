public class DataMembers {
    String name;
    static String cname = "ABC"; // static initialization

    static int add(int x, int y){return x+y;} // not related to object thus keeping this as static

    void setName(String n){
        name = n;
    }

    String getDetails(){
        return name + "-" + cname;
    }
    public static void main(String args[]){

        DataMembers d = new DataMembers();
        d.setName("Ananya");
        System.out.println(d.getDetails());
        System.out.println(d); // reference Id printed
    }

}
