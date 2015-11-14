import java.util.Arrays;

public class BestProfit {
  public static void main(String[] args) {
    int[] array = new int[] {10, 7, 12, 8, 5, 9};
    System.out.println(findBestProfit(array));
  }

  public static int findBestProfit(int[] stocks) {
    if (stocks.length < 1) {
      throw new IllegalStateException("Array is empty");
    }
    int[] sortedStocks = Arrays.copyOf(stocks, stocks.length);
    Arrays.sort(sortedStocks);
    int minPrice = sortedStocks[0];
    int maxPrice = 0;
    int index = 0;
    for (int k = 0; k < stocks.length; k++) {
      if (stocks[k] == minPrice) {
        index = k;
        break;
      }
    }

    for (int i = index + 1; i < stocks.length; i++) {
      if (stocks[i] > maxPrice) {
        maxPrice = stocks[i];
      }
    }
    //if the price after the lowest possible will go down, there is no positive profit.
    if (maxPrice < minPrice) {
      return -1;
    }
    return maxPrice - minPrice;
  }
}
