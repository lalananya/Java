class InitBlock{
    {
         System.out.println("Init 1");   
    }
    InitBlock(){
        this(10);
        System.out.println("default");
    }
    InitBlock(int x){
        System.out.println(x);
    }
    {
         System.out.println("Init 2");
    }
    public static void main(String args[]){
        new InitBlock();
        new InitBlock(10);
    }

}

/* Init block runs before constructor */