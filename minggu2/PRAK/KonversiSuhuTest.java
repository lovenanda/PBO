//class main
public class KonversiSuhuTest {
    public static void main(String[] args) {

        //deklarasi variabel 

        double celcius = 37.0;
        double fahrenheit = 145.0;
        double hasilCelcius;
        double hasilFahrenheit;

        KonversiSuhu temp = new KonversiSuhu();

        hasilCelcius = temp.toCelcius(fahrenheit);
        hasilFahrenheit = temp.toFahrenheit(celcius);

        System.out.println("--KONVERSI SUHU--\n");
        System.out.println("dari fahrenheit \t: "+fahrenheit+"\nke celcius menjadi \t: "+hasilCelcius);
        System.out.println("dari celcius \t\t: "+celcius+"\nke fahrenheit menjadi\t: "+hasilFahrenheit+"\n");

    }    
}
