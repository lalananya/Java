/* Access modifiers and dynamic binding */

class Base3{
    public void show(){
        System.out.println("base");
    }
    protected void display(){
        System.out.println("base");
    }
    private void display2(){
        System.out.println("base");
    }
}
class Child3 extends Base3{
    // protected void show(){
    //     System.out.println("Child");
    //     super.show();
    // }

    public  void show(){ // public only, protected default or private are weaker
        System.out.println("Child");
        super.show();
    }

    public  void display(){ // protected or public , default or private are weaker
        System.out.println("Child");
        super.display();
    }

    private  void display2(){ // protected or public or default ro priavte , EXCEPTION this is not overriding
        System.out.println("Child");
        //super.display2(); // Error
    }
    
    psvm(){
         Child3 c1 = new Child3();
        c1.show();
    }
}

/**
 * Rule 1 : Parent - public  | Child - protected ERROR cannot reduce the visibility
 * Rule 2 : public > protected > default > private
 * Rule 3 : Child - stronger | Parent - Weaker WORKS ! ACHIEVED
 * Rule 4 : Parent - stronger | Child - Weaker ERROR ! CANNOT ACHIEVE
 * Rule 5 : Parent | Child - same prioroty WORKS ! ACHIEVED | with an exception of both being private 
 * Rule 6 : To check if you achieved overrding call super.parentFunction()
 */