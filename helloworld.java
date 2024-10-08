class harsha{
    void manu(){
        System.out.println("\n Manu");
    }
};


class Java1{
    void harsha()
    {
        System.out.print("Harsha method");
    }

public static void main(String args[]){
    System.out.print("Hello World \n");
    harsha h=new harsha();
    Java1 j=new Java1();
    j.harsha();
    h.manu();
}
}