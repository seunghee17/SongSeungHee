import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        char arr[] = input.toCharArray();
        for(int i=0; i<arr.length; i++){
            if(Character.isUpperCase(arr[i])){
                arr[i] = Character.toLowerCase(arr[i]);
            }else{
                arr[i] = Character.toUpperCase(arr[i]);
            }
        }
        System.out.println(arr);
    }
}