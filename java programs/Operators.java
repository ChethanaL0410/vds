class Operator{
    public static void main(String[] args){
        int x=10;
        int y=5;
        System.out.println(x++);
        System.out.println(++x);
        System.out.println(x++ + ++x);
        //left shift operator
        System.out.println(10<<2);//10*2^2 10*4=40
        //right shift operator
        System.out.println(10>>2);//10/2^2 10/4=2
        int min=(x<y)?x:y;  
        System.out.println(min);  

    }
}