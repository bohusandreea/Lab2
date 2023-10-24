public class Ex1 {
    public static void main(String[] arg){

        Integer[] arr={12,3,7,90,100};
        boolean prim;
        for(int i=0;i<arr.length;i++)
        {   prim=true;
            for(int j=2;j<arr[i]/2;j++)
            {
                if(arr[i]%j==0)
                {prim=false;break;}
            }
            if(prim)
                System.out.println(arr[i]);
        }
    }
}
