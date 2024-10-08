class javacons{
    int a;
    public javacons(int a,int b)
    {
     System.out.println(a+" "+b);
    }
    public static void main(String args[]){
        javacons myobj=new javacons(10,20);
        myobj.a=30;
        System.out.println(myobj.a);
    }
}