public class oddeven{

    public static void main main(String args[]){
        int a=29;
        boolean flag=false;
        for(int i=2;i<=a/2;i++)
        {
            if(a%i==0)
            flag=true;
            break;
        }

        if(!flag)
            System.out.println("a is prime");
        else
            System.out.println("a is prime");   
    }
}