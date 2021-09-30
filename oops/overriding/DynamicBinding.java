/* Using the concept where child class object is put in parent class refernce variable */

class Base {
    void show(){
        System.out.println("Base");
    }
}

class Child extends Base {
    // void show(){
    //     System.out.println("Child");
    // }

    void display(){
        System.out.println("DDDChild");
    }

    public static void main(String []args){
        Base obj = new Child();
        obj.show();
       // obj.display(); // we can't run this normally we will be using down casting

        Child c = (Child)obj;
        c.display();
    }
}
