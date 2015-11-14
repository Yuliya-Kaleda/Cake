
public class ProductOfAllInt {
  public static void main(String[] args) {
    int[] array = new int[] {3, 2, 5, 1};
    int[] productArray = getProductOfAllInt(array);
    for (Integer integer: productArray) {
      System.out.println(integer);
    }
  }

  public static int[] getProductOfAllInt(int[] array) {
    int[] result = new int[array.length];
    for (int i=0; i < array.length; i++) {
      int[] temp = new int[array.length];
      System.arraycopy( array, 0, temp, 0, array.length );
      temp[i] = 1;
      result[i] = calculateProduct(temp);
    }
    return result;
  }

  public static int calculateProduct(int[] array) {
    int product = 1;
    for (Integer integer: array) {
      product *= integer;
    }
    return product;
  }
}
