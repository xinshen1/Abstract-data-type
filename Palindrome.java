
   
public class Palindrome {
    // Add your definition of isPal here.

    /*
    A string of length 1 and an empty string should both be considered palindromes. Throw an exception for null values.
    Although we can implement solutions to this problem using recursion or an appropriately constructed loop that manipulates the String object directly
    */
    public static boolean isPal(String a){
        if (a == null){
            throw new IllegalArgumentException();
        }

        else if(a.length() == 1 ){
            return true;
        }
        ArrayQueue <Character> tempq = new ArrayQueue<Character>(a.length());
        ArrayStack <Character> temps = new ArrayStack<Character>(a.length());
        for (int i=0; i< a.length(); i++){
            Character x;
            x = a.charAt(i);
            if (x!= ' ' && x != '.' && x != ',' && x != '!' && x != '?' && x != ':' ){
                tempq.insert(Character.toLowerCase(x));
                temps.push(Character.toLowerCase(x));
            }

        }

        while(!tempq.isEmpty() || !temps.isEmpty()){
            Character v = temps.pop();
            Character u = tempq.remove();
            if(v != u){
                return false; 
            }
        }
        return true;
        
    }

    
    public static void main(String[] args) {
        System.out.println("--- Testing method isPal ---");
        System.out.println();

        System.out.println("(0) Testing on \"A man, a plan, a canal, Panama!\"");
        try {
            boolean results = isPal("A man, a plan, a canal, Panama!");
            System.out.println("actual results:");
            System.out.println(results);
            System.out.println("expected results:");
            System.out.println("true");
            System.out.print("MATCHES EXPECTED RESULTS?: ");
            System.out.println(results == true);
        } catch (Exception e) {
            System.out.println("INCORRECTLY THREW AN EXCEPTION: " + e);
        }
        
        System.out.println();    // include a blank line between tests
        
        /*
         * Add five more unit tests that test a variety of different
         * cases. Follow the same format that we have used above.
         */
        // test 1
        System.out.println("--- Testing method isPal ---");
        System.out.println();

        System.out.println("(1) Testing on \" \"");
        try {
            boolean results = isPal(" ");
            System.out.println("actual results:");
            System.out.println(results);
            System.out.println("expected results:");
            System.out.println("true");
            System.out.print("MATCHES EXPECTED RESULTS?: ");
            System.out.println(results == true);
        } catch (Exception e) {
            System.out.println("INCORRECTLY THREW AN EXCEPTION: " + e);
        }
        
        System.out.println(); 

        //test 2
        System.out.println("--- Testing method isPal ---");
        System.out.println();

        System.out.println("(2) Testing on \"Mr. Owl ate my metal worm? !\"");
        try {
            boolean results = isPal("Mr. Owl ate my metal worm? !");
            System.out.println("actual results:");
            System.out.println(results);
            System.out.println("expected results:");
            System.out.println("true");
            System.out.print("MATCHES EXPECTED RESULTS?: ");
            System.out.println(results == true);
        } catch (Exception e) {
            System.out.println("INCORRECTLY THREW AN EXCEPTION: " + e);
        }
        
        System.out.println(); 

        //test 3
        System.out.println("--- Testing method isPal ---");
        System.out.println();

        System.out.println("(3) Testing on \"Mr. u ate my metal worm? !\"");
        try {
            boolean results = isPal("Mr. u ate my metal worm? !");
            System.out.println("actual results:");
            System.out.println(results);
            System.out.println("expected results:");
            System.out.println("false");
            System.out.print("MATCHES EXPECTED RESULTS?: ");
            System.out.println(results == false);
        } catch (Exception e) {
            System.out.println("INCORRECTLY THREW AN EXCEPTION: " + e);
        }
        
        System.out.println(); 

        //test 4
        System.out.println("--- Testing method isPal ---");
        System.out.println();

        System.out.println("(4) Testing on \"Mr. u ate my metal worm? !\"");
        try {
            boolean results = isPal("Mr. u ate my metal worm? !");
            System.out.println("actual results:");
            System.out.println(results);
            System.out.println("expected results:");
            System.out.println("false");
            System.out.print("MATCHES EXPECTED RESULTS?: ");
            System.out.println(results == false);
        } catch (Exception e) {
            System.out.println("INCORRECTLY THREW AN EXCEPTION: " + e);
        }
        
        System.out.println(); 

         //test 5
         System.out.println("--- Testing method isPal ---");
         System.out.println();
 
         System.out.println("(5) Testing on \"Null Value\"");
         try {
             String x = null;
             boolean results = isPal(x);
             System.out.println("actual results:");
             System.out.println(results);
             System.out.println("expected results:");
             System.out.println("false");
             System.out.print("MATCHES EXPECTED RESULTS?: ");
             System.out.println(results == false);
         } catch (Exception e) {
             System.out.println("INCORRECTLY THREW AN EXCEPTION: " + e);
         }
         
         System.out.println(); 







    }
}