import java.io.*;
import java.lang.*;
 
// Class
class GFG {
   
  // Main driver method
  public static void main(String[] args) {
 
     // Declaring and initializing
     // double value
    double a = 0.9;
 
    // Setting the precision
    // to 20 places
    System.out.println(
      String.format("%.20f", a));
 
    double b = 1;
 
    // Setting the precision
    // to 5 places
    System.out.println(
      String.format("%.5f", b));
  }
}
