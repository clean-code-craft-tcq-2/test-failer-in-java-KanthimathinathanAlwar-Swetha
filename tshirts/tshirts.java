import static org.junit.Assert.assertTrue;
public class tshirts {
    static String size(int cms) {
        if(cms < 38) {
            return "S";
        } else if(cms > 38 && cms < 42) {
            return "M";
        } else {
            return "L";
        }
    }

    public static void main(String[] args) { 
        assertTrue(size(37).equals("S"));
        assertTrue(size(38).equals("S"));
        assertTrue(size(40).equals("M"));
        assertTrue(size(43).equals("L"));
        System.out.println("All is well (maybe!)");
    }
}
