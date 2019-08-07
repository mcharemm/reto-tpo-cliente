package pe.promart.util;

public class ConfigurationUtil {

    public static String buildURL(String dbname){
        return String.format("https://%s.firebaseio.com", dbname);
    }
}
