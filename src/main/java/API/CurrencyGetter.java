package API;

import API.model.CurrencyCodes;
import API.model.Root;

import java.util.stream.Collectors;

public class CurrencyGetter {
    static String getCurrency(Root root, CurrencyCodes code) {
       return root.getRates()
               .stream()
               .filter(rate -> code.name().equals(rate.getCode()))
               .map(rate -> "Średni kurs waluty %s na dzień %s wynosi %s zł.".formatted(rate.getCurrency(), root.getEffectiveDate(), rate.getMid()))
               .collect(Collectors.joining());

    }
}
