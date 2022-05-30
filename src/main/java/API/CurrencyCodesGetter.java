package API;
import API.model.Root;
import java.util.stream.Collectors;

public class CurrencyCodesGetter {
    public static String getCurrencyCodes(Root root){
        return root.getRates()
                .stream()
                .map(rate -> rate.getCode())
                .collect(Collectors.joining(", "));

    }
}
