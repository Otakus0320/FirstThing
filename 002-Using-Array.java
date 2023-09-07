public class Otakus0320 {
   public static int max(int[] m) {
      int max_num = 0;
      int count = 0;
      while (count < m.length){
         if (max_num < m[count]){
            max_num = m[count];
         }
         count += 1;
      }
      return max_num;
   }
   public static void main(String[] args) {
      int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
      System.out.print(max(numbers));
   }
}
