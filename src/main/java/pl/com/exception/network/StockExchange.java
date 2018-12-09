package pl.com.exception.network;
import java.util.Random;

public class StockExchange {

private static final Random random = new Random();
    // constructor StockExchangeCreationException
    // ReadDataException
    // Random - % 2 -

    public String readData() throws ReadDataException {
        if (random.nextInt(100) % 2 == 1) {
        throw new ReadDataException ("read data from server has failed!");
        }
    return "data";
    }

    public StockExchange() throws StockExchangeCreationException{
     if (random.nextInt(100) % 2 == 1) {
         throw new StockExchangeCreationException("network connection error");
        }
    }

    public static void main(String[] args) {
        StockExchange stockExchange = new StockExchange();

    String readData = null;
    try {
        stockExchange.readData();
        System.out.println("after");   // wykona się, gdy metoda nie wyrzuci wyjątku
    } catch (ReadDataException exc) {
        readData = "";
    } finally {
        System.out.println("finally");
    }


        System.out.println(readData);
    }

}
