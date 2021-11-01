import java.util.Scanner;

class C{
    int r;
    void judge(int R){
        r=R;
        int j=0;
        for(int i=1;i<=r;i++){
            if(r%i==0){
                j++;
            }   
        }
        if(j==2){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
    }
}
public class Class02 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        C c=new C();
        c.judge(a);
    }
}
