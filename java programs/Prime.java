class Prime{
    public static void main(String[] args){
        int a=15;
        int flag=0;
        if(a==0 || a==1){
            System.out.println("Not a prime number");
        }
        else{
            for(int i=2;i<a;i++){
                if (a%i==0){
                    System.out.println("Not a prime number");
                    flag=1;
                    break;
                }
                

            }
            if(flag==0){
                System.out.println("prime number");
        }
        
        }
    }
}