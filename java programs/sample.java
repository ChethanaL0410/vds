class Sample
{
    public static void main(String[] args){
    Car benz=new Car();
    benz.rotate();
    }

 static class Car{
    private int carno;
    private String carname;
    private String carmodel;

    private static void rotate(){
        System.out.println("Running...");
    }
    

    }


}