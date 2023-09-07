public class Otakus0320 {
   public static void Triangle(int SIZE){
      int row = 0;
      while (row < SIZE){
        row += 1;
        int col = 0;
        while (col < row){
          System.out.print("*");
          col += 1;
        }
        System.out.println();
      }
   }
    public static void main(String[] args) {
       Triangle(6);
    }
}
