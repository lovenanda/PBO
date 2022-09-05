public class KonversiSuhu {
    private double celcius;
    private double fahrenheit;

    public double toFahrenheit(double celcius){
        fahrenheit = ((9 / 5) * 37) + 32;
        return fahrenheit;
    }

    public double toCelcius(double fahrenheit){
        celcius = (fahrenheit - 32)*5/9;
        return celcius;
    }
    
}
