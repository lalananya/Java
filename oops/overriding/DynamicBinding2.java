/* static functions and dynamic binding */

class Base2{
    static void show(){
        System.out.println("base");
    }
}
class Child2 extends Base2{
    
    static void show(){
        System.out.println("Child");
        //super.show(); /* cannot use super in a static context obviosly */
    }
    
    public static void main(String args[]){
         Child2 c1 = new Child2();
         c1.show(); /* not needed cause we are calling static function, let's run anyway*/
    }
}

/** 'child' runs
 *  This is not dynamic binding, because dynamic binding means binding of object at run time
 *  static things are not related to object, this concept in called Function Hiding 
 */