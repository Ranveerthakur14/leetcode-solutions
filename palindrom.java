package String;

public class palindrom {
    public static  boolean ispalindrom(int x){

        if(x<0){
            return false;
        }
        int rev=0;
        int num=x;
        while(num!=0){
            rev=(rev*10)+(num%10);
            num=num/10;

        }
        return (rev==x);
    }

    public static void main(String[] args){
        int n =121;
        System.out.print(ispalindrom(n));

    }
    
}
