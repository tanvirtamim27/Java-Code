import java.util.Scanner;

public class SumLitCode {
    public static void main(String[] args) {
        int[] a= new int[4];
        Scanner scanner = new Scanner(System.in);
        for(int i= 0;i<4;i++){
             
            a[i]=scanner.nextInt();
        }
        int t= scanner.nextInt();

        for(int i= 0;i<4;i++){
            for(int j=i+1;j<4;j++){
                if(a[i]+a[j]==t){
                    System.out.println(a[i]+","+a[j]);
                }
            }
        }

    }
}
