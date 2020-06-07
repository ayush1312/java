package interview;

public class GetColumnName {
    public void getName(int num){
        String str = "";
        while(num > 0){
            int rem = num % 26;
            num= num/26;
            str = ((char)(rem + 64 ) )+ str;
        }
        System.out.println(str);
    }

    public static void main(String[] args) {
        GetColumnName g = new GetColumnName();
        g.getName(1000);
    }
}
