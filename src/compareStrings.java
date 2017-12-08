import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by cmp on 12/8/2017.
 */
public class compareStrings {

    public static void main(String[] args) {
        String product;
        product = "         Water, CI 77891 (Titanium Dioxide), CI 77492 (Iron Oxide), CI 77491 (Iron Oxide), CI 77499 (Iron Oxide) 46%";


        cleanInput(product);
        return;
        }

    private static void cleanInput(String product) {
        String myString = product.trim().replaceAll("[CI\\s\\d]{6,9}", "");
        String finalString = myString.trim().replaceAll("[()\\\\0-9%]{1,3}", "");

        String[] listString = finalString.split("[,/]");
        ArrayList<String> finalList = new ArrayList<String>(Arrays.asList(listString));

        return finalList;
    }
}
