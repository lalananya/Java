/* Dynamic binding not possible with this modifier */

class Base1 {
    final void show(){ /* final keyword is used to stop function overrding hence dynamic binding */
        System.out.println("Base");
    }
}

// class Child1 extends Base1 {
//     void show(){
//         System.out.println("Child");
//     }
//     public static void main(String []args){
       
//     }
// }
