class LastWorld{
    public static int lengthoflastworld(String s){
        int count =0;
        int i=s.length()-1;
        while(i>=0 && s.charAt(i)==' '){
            i--;
        }
                while (i>=0 && s.charAt(i)!=' '){
          
                    count++;
                    i--;
        }
        
        return count;

    } 
    public static void main(String [] args){
        String s=" Hello world";
        System.out.print(lengthoflastworld(s));
    }
}