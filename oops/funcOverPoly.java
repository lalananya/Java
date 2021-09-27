public class funcOverPoly {
    void show(){
        System.out.println("No Arguments");
    }

    void show(int x){
        System.out.println(x);
    }

    void show(float f){
        System.out.println("No Arguments");
    }

    void show(int x, float f){
        System.out.println(x);
        System.out.println(f);
    }

    void show(char c){
        System.out.println(c);
    }

    public static void main(String []args){
        funcOverPoly obj = new funcOverPoly();
        obj.show(10); // int one
        obj.show(10,10); // int and float cause second wrg will be typecasted
        obj.show('a'); // char one, if char missing then int Type casting rule applies
    }
}
