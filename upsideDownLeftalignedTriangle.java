import java.util.Scanner;
public class upsideDownLeftalignedTriangle {
    public static void main(String[] args) {
        System.out.println("Enter the hight of the triangle.");
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        for(int i=1; i<=h; i++){
            for(int j=1; j<=(h+1)-i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
