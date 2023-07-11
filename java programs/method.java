class Method{
    public static void main(String[] args){
        int a=10;
        int b=10;
        int sum=0;
        add(a,b,sum);
        

       
    }

    private static void add(int a, int b, int sum) {
        sum=a+b;
            System.out.println("Sum of two numbers: "+sum);
    }
} 