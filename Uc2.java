public class Uc2 {
  // determines the largest of three Comparable objects
  public static <P extends Comparable<P>> P maximum(P a, P b, P c) {
    P max = a; // assume a is initially the largest

    if (b.compareTo(max) > 0)
      max = b; // b is the largest so far

    if (c.compareTo(max) > 0)
      max = c; // c is the largest

    return max; // returns the largest object
  } // end method maximum

  public static void main(String arg[]) {
 
    System.out.print("Maximum of %.1f, %.1f and %.1f is %.1f\n\n", 6.6, 8.8, 7.7, maximum(6.6,8.8, 7.7));
   
  }
}
