public class count_digits{
    public static int countdigits(int num){
        int c=0;
        while(num!=0){
            num=num/10;
            c++;
        }
        return c;
    }
    public static void main(String[] args){
        int num=12345;
        int count=countdigits(num);
        System.out.println("count  : "+count);
        
    }
}