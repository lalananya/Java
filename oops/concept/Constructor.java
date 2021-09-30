public class Constructor {
    
    int salary = 0;
    Constructor(){ // can use a parameterized constructor as well
        this.salary = 100000; // dynamic intialisation
    }
    public static void main(String args[]){
        Constructor obj = new Constructor();
        System.out.println(obj.salary); // to avoid direct access , you can use access modifier :)
    }
}

class Constructor2{

    int x = getX();
    int getX(){
        System.out.println(x); // 0 - why 0 ? because default constructor will be inserted by compiler whic will initialize the variable
        return 20;
    }
    void show(){
        System.out.println(x); // 20
    }
    public static void main(String args[]){
        Constructor2 obj = new Constructor2();
        obj.show(); 
    }

}


class Constructor3{

    Constructor3(){
        this(10);
        System.out.println("default");
    }
    Constructor3(int x){
        this(10,20);
        System.out.println(x);
    }
    Constructor3(int x, int y){
        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String args[]){
        Constructor3 obj = new Constructor3();
    }

}

