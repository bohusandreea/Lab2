public class ex2 {
    public static void main(String[] arg){

        int n=20;
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        for(int i=3;i<n;i++)
        {
            int s;
            s=a+b;
            System.out.println(s);
            a=b;
            b=s;
        }
    }

}
