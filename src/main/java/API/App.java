package API;

import API.model.CurrencyCodes;
import API.model.Root;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class App {
    public static void main(String[] args) throws IOException {
        //API connection
        URL url = new URL("http://api.nbp.pl/api/exchangerates/tables/a/?format=json");
        String result = "";
        try(BufferedReader br = new BufferedReader(new InputStreamReader(url.openConnection().getInputStream()));){
            String inputLine;
            while((inputLine = br.readLine()) != null) {
                result += inputLine;
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        //mapping result to POJO
        ObjectMapper objectMapper = new ObjectMapper();
        Root root = objectMapper.readValue(result, Root[].class)[0];

        System.out.println(CurrencyGetter.getCurrency(root, CurrencyCodes.TRY));

    }

}
