/**
 * KonversiSuhuTest
 */
public class KonversiSuhuTest {

    public static void main(String[] args) {
        double suhuCelcius = 37.0;
        double suhuFahrenheit = 145.0;
        double hasilCelcius;
        double hasilFahrenheit;

        KonversiSuhu temp = new KonversiSuhu();

        hasilCelcius = temp.toCelcius(suhuFahrenheit);
        hasilFahrenheit = temp.toFahrenheit(suhuCelcius);

        System.out.println(hasilCelcius);
        System.out.println(hasilFahrenheit);
    }
}