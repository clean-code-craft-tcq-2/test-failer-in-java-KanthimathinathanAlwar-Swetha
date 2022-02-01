import java.util.HashMap;
import java.util.Map;

public class misaligned {
  static Map<Integer, String> colorPair = new HashMap<>();
  static String[] majorColors = { "White", "Red", "Black", "Yellow", "Violet" };
  static String[] minorColors = { "Blue", "Orange", "Green", "Brown", "Slate" };

  static void printColorMap(final int pairNumber, final int i, final int j) { 
    System.out.printf("%3d | %8s | %8s%n", pairNumber, majorColors[i - 1], minorColors[j - 1]);
  }

  static Map<Integer, String> getColorPair() {
    int i = 1, j = 1;
    for (i = 1; i <= 5; i++) {
      for (j = 1; j <= 5; j++) {
        int pairNumber = ((i - 1) * 5) + j;
        colorPair.put(pairNumber, majorColors[i - 1] + " " + minorColors[j - 1]);
        printColorMap(pairNumber, i, j);
      }
    }
    return colorPair;
  }
  public static void main(String[] args) { 
  Map<Integer, String> colorMap = getColorPair();
      assert(colorMap.get(14).equals("Black Brown"));
      assert(colorMap.get(2).equals("White Orange"));
      System.out.println("All is well (maybe!)");
  }
}
