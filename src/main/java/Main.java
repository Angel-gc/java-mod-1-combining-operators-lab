public class Main {
    public static void main(String[] args) {
        // your code here
       System.out.println("Truth table for && operator"); 
        boolean first = true && true;
        boolean second = true && false;
        boolean third = false && false;
        boolean fourth = false && true;
        
        for (int i = 0; i < 4; i++){
            if(i == 0 && first){
                System.out.println("true && true = true");
            }
            else if (!(i == 1 && second)){
                System.out.println("true && false = false");
            }
            else if (!(i == 2 && third)){
                System.out.println("false && false = false");
            }
            else if (i == 3 && fourth){
                System.out.println("false && true = false");
            } 
        }

    }

}
