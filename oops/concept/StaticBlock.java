class StaticBlock extends Exception{
    static int x = 10; // here it will get memory at compile time
    static int y;
    static {
        try{
            y = System.in.read(); // static initialization will be done at run time, dynamically
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public static void main(String args[]){
        System.out.println(StaticBlock.x);
        System.out.println(StaticBlock.y);
        /* static things do not require objects */
    }

}
