public class ex3 {
    public static void main(String[] arg){

        int n=121;
        int aux;
        int inv=0;
        aux=n;
        while(aux!=0)
        {
            inv=inv*10+aux%10;
            aux/=10;
        }
        if(n==inv)
            System.out.println("Numarul este prim");
        else
            System.out.println("Numarul nu este prim");
    }

}
