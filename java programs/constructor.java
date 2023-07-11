class constructor
{
    public static void main(String[] args){
    
    Car benz=new Car(10, "abc", "xyz" );
    System.out.println(benz.carno);
    benz.rotate();
    }

 static class Car{
    private int carno;
    private String carname;
    private String carmodel;

    Car(int no,String name,String model){
        this.carno=no;
        this.carname=name;
        this.carmodel=model;
    }

    public static void rotate(){
        System.out.println("Running...");
    }
    

    }


}