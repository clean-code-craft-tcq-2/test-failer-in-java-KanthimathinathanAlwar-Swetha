public class alerter {
    static int alertFailureCount = 0;
    static int networkAlertStub(float celcius) {
        System.out.println("ALERT: Temperature is " + celcius + " celcius");
        if (celcius > 200) {
      		return 500;
    	}
    	return 200;
    }
    static float farenheitToCelcius(final float farenheit) {
    	return ((farenheit - 32) * 5) / 9;
    }
    static void alertInCelcius(float farenheit) {
        float celcius = farenheitToCelcius(farenheit);
        int returnCode = networkAlertStub(celcius);
        if (returnCode != 200) {
            alertFailureCount += 1;
        }
    }
    public static void main(String[] args) {
        alertInCelcius(400.5f);
        alertInCelcius(303.6f);
	assert(alertFailureCount == 1);
        System.out.printf("%d alerts failed.\n", alertFailureCount);
        System.out.println("All is well (maybe!)\n");
    }
}
