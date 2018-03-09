package priv.scor.lesson1.loop;


public class Recursion {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //System.out.println(method(4));
        //System.out.println(fibonacci(10));
        int[] is = f(10);  
        for(int i : is)  
         System.out.println(i);
    }
    
    static int method(int i){
        if(i==1){
            return 1;
        }else{
            return i*method(i-1);
        }
    }
    
    static int fibonacci(int n){
        if(n==1 || n ==2){
            return 1;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    
    static int[] f(int length) {  
        if (length < 2)  
         return null;  
        int[] fs = new int[length];  
        fs[0] = 1;  
        fs[1] = 1;  
        for (int i = 2; i < length; i++) {  
         fs[i] = fs[i-1] + fs[i-2];  
        }  
          
        return fs;
        
       }  

}
