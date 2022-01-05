import java.util.Scanner;
public class Main {
    static int say(int a,int b,int c){
        if(a>0&&c==1&&a<=b){
 System.out.print(" "+a);
            a=a-5;
            return say(a,b,1);
        }
        else if(a<0){
            System.out.print(" "+a);
            a=a+5;
            return say(a,b,2);
        }
        else if(a>0&&c==2&&a<=b){
            System.out.print(" "+a);
            a=a+5;
            return say(a,b,2);
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("sayi girin:");
        int a= input.nextInt();
        say(a,a,1);
    }
}
