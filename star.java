public class Star {
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
----------
output:
----------
PS C:\SOU> javac Star.java
PS C:\SOU> java Star.java 
*
**   
***  
**** 
*****
PS C:\SOU> 
