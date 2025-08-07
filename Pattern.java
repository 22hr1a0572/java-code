public class Pattern {
    public static void main(String args[]){
        int n = 5;
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++){
                if(i == 0|| i == n-1 || j == 0 || j == n-1){
                    System.out.print("x");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
----------------
output:
------------PS C:\SOU> javac Pattern.java
PS C:\SOU> java Pattern.java 
xxxxx
x   x
x   x
x   x
xxxxx
PS C:\SOU> 
