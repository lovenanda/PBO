//class Konversi Shuhu
public class KonversiSuhu {

    private double celcius;
    private double fahrenheit;

    //methode rumus celcius -> fahrenheit

    public double toFahrenheit(double celcius){
        fahrenheit = (celcius * 9 / 5) + 32;
        return fahrenheit;
    }

    //methode rumus fahrenheit -> celcius

    public double toCelcius(double fahrenheit){
        celcius =  (fahrenheit - 32) * 5/9 ;
        return celcius;
    } 
}
