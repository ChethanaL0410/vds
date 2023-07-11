class Static{
    static String brandname="Benz";
    int modelno;
    String modelname;
    
    public static void main(String[] args) {
       
        Static s=new Static(1, "suv");
        Static s1=new Static(2, "daimler");
       // System.out.println(brandname+""+modelno+""+modelname);
         System.out.println(s.modelno);
         System.out.println(s.modelname);
         System.out.println(s1.modelno);
         System.out.println(s1.modelname);
        }
     public Static(int no, String name){
        this.modelno=no;
        this.modelname=name;
    }
}