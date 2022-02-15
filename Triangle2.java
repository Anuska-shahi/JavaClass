import java.util.*;
public class Triangle2{
    public static void main(String[] args){
	int size;
	Scanner scan=new Scanner(System.in);
	System.out.println("Mention size for triangle");
	size=scan.nextInt();
	for(int i=1;i<=size;i++){
		for(int j=size;j>=i;j--){
        		System.out.print("*");
		}
		System.out.print("\n");
	}
    }
}