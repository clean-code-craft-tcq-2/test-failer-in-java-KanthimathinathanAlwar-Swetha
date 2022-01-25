import java.util.HashMap;
import java.util.Map;

public class misaligned {
    static Map<String, String> printColorMap() {
	Map<String, String> colorPair = new HashMap<String, String>();
        String majorColors[] = {"White", "Red", "Black", "Yellow", "Violet"};
        String minorColors[] = {"Blue", "Orange", "Green", "Brown", "Slate"};
        int i = 0, j = 0;
        for(i = 0; i < 5; i++) {
            for(j = 0; j < 5; j++) {
		colorPair.put(String.valueOf(i) + String.valueOf(j), majorColors[i] + " " + minorColors[i]);
                System.out.printf("%d | %s | %s\n", i * 5 + j, majorColors[i], minorColors[i]);
            }
        }
        return colorPair;
    }
    public static void main(String[] args) { 
	Map<String, String> result = printColorMap();
        assert(result.get("23").equals("Black Brown"));
	assert(result.get("02").equals("White Orange"));
        System.out.println("All is well (maybe!)");
    }
}
