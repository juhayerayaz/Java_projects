
package javaapplication4;



public class JavaApplication4 {

   
    public static void main(String[] args) {
        int n1=0;
        int n2=1;
        int sum=1;
        System.out.println(n1);
        System.out.println(n2);
       for(int i=1; i<=10; i++){ 
           sum=n1+n2;
           
           System.out.println(sum);
           n1=n2;
           n2=sum;
          if(i%2!=0){System.out.println(i+" is odd number");}
          else{System.out.println(i+" is even number");}
       }
        
    }

    }
   
