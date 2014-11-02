package Model;

public class Currency {

    private String name;
    private String symbol;

    public Currency(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }
    
    @Override
    public String toString() {
        return name + " (" + symbol + ")";
    }

    String getName() {
        return name;
    }

    String getSymbol() {
        return symbol;
    }
}
