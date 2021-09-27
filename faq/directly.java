class A1 {
    public static void main(String ...args) {
        System.out.println(args);
    }

    // public static void main(String []args) {
    //     System.out.println(args);
    // }
}

class B1{
    public static void main(String []args) {
        A1.main("10");
    }
}
