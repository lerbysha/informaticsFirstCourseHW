import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PropertyExtractor {
    private static Logger logger = Logger.getLogger(PropertyExtractor.class.getName());

    public static void main(String[] args) {
        Properties properties = new Properties();
        try(FileInputStream is = new FileInputStream("src\\main\\resources\\config.properties")) {
            properties.load(is );
        } catch (IOException e) {
            logger.log(Level.WARNING, e.getMessage(), e);
        }

        if (properties.isEmpty()) {
            logger.log(Level.INFO, "No properties");
            return;
        }
        System.out.println(properties.getProperty("rainbow"));
        System.out.println(properties.getOrDefault("size", "0"));
        System.out.println(properties.get("column"));
        System.out.println(properties.getProperty("row"));
    }
}