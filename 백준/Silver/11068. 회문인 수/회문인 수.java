import java.util.*;

public class Main {
    static char[] arr = new char[64];
    
    public static void preprocess(){
    for(int i=0; i<64; i++){
        if(i<10) arr[i] = (char)('0'+i);
        else if(i<36) arr[i] = (char)('A' + i - 10);
        else if(i<62) arr[i] = (char)('a' + i - 36);
        else if(i == 62) arr[i] = '+';
        else arr[i] = '/';
    }}
    
    
    public static boolean isPal(String s){
        String a = new StringBuffer(s).reverse().toString();
        
        return s.equals(a);
    }
    
    public static String pal(int n, int d){
        StringBuffer sb = new StringBuffer();
        while(n > 0){
            sb.append(arr[n%d]);
            n /= d;
        }
        
        return sb.reverse().toString();
    }
    
    public static void main (String[] args) {
        preprocess();
        
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            boolean found = false;
            for(int i=2; i<65; i++){
                String check = pal(n, i);
                
                if(isPal(check)){
                    found = true;
                    System.out.println(1);
                    break;
                }
            }
            if(!found)System.out.println(0);
        }
    }
}