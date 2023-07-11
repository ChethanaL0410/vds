class Inheritance{
    int empno=1;
    String empname="anu";
}
class Details extends Inheritance{
    String adress="bangalore";
    String phonenum="9900198869";
public static void main(String[] args){

Details emp=new Details();
System.out.println("employee number "+emp.empno);
System.out.println("employee name "+emp.empname);
System.out.println("employee address "+emp.adress);
System.out.println("employee phone number "+emp.phonenum);


}



}
