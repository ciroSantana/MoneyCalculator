package View.Persistence;

import Model.Currency;
import Model.CurrencySet;

public class CurrencySetLoader {
    
    public CurrencySet load(){
        CurrencySet set = new CurrencySet();
        set.add(new Currency("Dolar","$"));
        set.add(new Currency("Euro","€"));
        set.add(new Currency("Libra","L"));
        set.add(new Currency("Yen","Y"));
        
        return set;
    }
    
}
