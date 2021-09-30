public class Encaps {
    
    String name;
    int salary;

    void get(String n, int s){
        name = n;
        salary = s;
    }

    void show(){
        System.out.println(name);
        System.out.println(salary);
        }
    public static void main(String []args) {  // which will be searched by JVM
    Encaps e = new Encaps(); // returns reference Id
    e.get("ananya",3000000); 
    e.show();
    }
}
    