import java.util.*;
public class hexa {
    public static void main(String args[]){
        int N,c=0;
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        for(int i=1;i<N;i++){
            if((i<N))
            {
                N=N/i;
                c+=1;
            }
            else{
            N-=1;}
        }
        System.out.println(c);
        sc.close();

    }
    
}
 