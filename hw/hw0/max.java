public class ClassNameHere {   
   public static int max(int[] m) {    
      int i = 0;
      int k = m[0];
      while ( i < m.length) {
         if ( k < m[i]) {
            k = m[i];
         }
         i = i + 1;
      }
      return k;
   }
   public static void main (String[] args) {
      int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
      System.out.print(max(numbers));
   }
}

/* Solution 2 */

public class ClassNameHere {   
   public static int max(int[] m) {    
      int k = m[0];
      for (int i = 0; i < m.length; i = i+1) {
         if ( k < m[i]) {
            k = m[i];
         }
      }
      return k;
   }
   public static void main (String[] args) {
      int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
      System.out.print(max(numbers));
   }
}
