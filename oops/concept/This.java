public class This {
    int x=20;
    void show(int x){
        System.out.println(x);
        System.out.println(this.x); // this refers here to current class object which will call the instance variable x
    }
    public static void main(String args[]){
        This obj = new This();
        obj.show(80);
    }
}

class Thistwo{
    int x=20;
    int y=30;
    void show(int x, Thistwo z){
        System.out.println(x);
        System.out.println(z.x); // this refers here to  object passed as an argument
    }
    public static void main(String args[]){
        Thistwo obj = new Thistwo();
        obj.show(80,obj);
    }
}
