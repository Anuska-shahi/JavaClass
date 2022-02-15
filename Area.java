import java.util.*;
public class Area{
    public static void main(String[] args){
        double length,breadth,area;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter length and breadth of rectangle");
        length=scan.nextDouble();
        breadth=scan.nextDouble();
        area=length*breadth;
        System.out.println( "The area of rectangle is "+area);
    }
}