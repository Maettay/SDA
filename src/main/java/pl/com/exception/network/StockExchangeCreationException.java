package pl.com.exception.network;



public class StockExchangeCreationException extends RuntimeException {
    public StockExchangeCreationException(String message) {
        super(message);
    }
}