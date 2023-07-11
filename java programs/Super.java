class Super{
    String carname="benz";
    public static void main(String[] args) {
        newcar car=new newcar();
        car.printColor();
    }
}
class newcar extends Super{
    String carname="ferrari";
    int carno=1;
    void printColor(){
    System.out.println(carname);
    System.out.println(super.carname);
    }
}
