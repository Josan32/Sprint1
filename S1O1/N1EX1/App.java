package N1EX1;

public class App {

    public static void main (String [] args){
        InstrumentoCuerda guitarra = new InstrumentoCuerda("Fender", 1500);
        guitarra.tocar();
        InstrumentoViento violin = new InstrumentoViento("Fender", 1500);
        violin.tocar();

    }
}
