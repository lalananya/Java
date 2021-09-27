public class Casting {
    public static void main(String []args){
        byte c = 10;
        byte b = 20;
        byte z = (byte)(c+b); // required
        int res = c+b; // you know the reason 
        System.out.println(res);
        System.out.println(z);
        print();
    }

    static void print(){
        int ch = (char)('a');
        System.out.println(ch);

        long lh = (long)(ch);
        float fh = (float)(ch);
        double dh = (double)(ch);
        System.out.println(lh);
        System.out.println(fh);
        System.out.println(dh);

        /*
        - char->int
        - byte->short
        - short->int
        - int->long
        - int->float
        - int->double
        - long->float
        - long->double
        - float->double
        - double->!error
         */
    }   
}
