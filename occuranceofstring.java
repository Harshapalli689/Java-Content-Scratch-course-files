import java.util.*;

class occuranceofstring {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str,findStr;
	    str=sc.nextLine();
	    findStr=sc.nextLine();
        int lastIndex = 0;
        int count = 0;

        while(lastIndex != -1){
            lastIndex = str.indexOf(findStr,lastIndex);
            System.out.print("whi"+lastIndex);
            if(lastIndex != -1)
            {
                count ++;
                lastIndex += findStr.length();
                System.out.println("in cond-fin"+findStr);
                System.out.println("in cond"+lastIndex);
            }
        }
        System.out.println("c:"+count);
        sc.close();
	    
	}
}

