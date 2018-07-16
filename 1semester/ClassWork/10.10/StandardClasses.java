import java.text.DateFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 *
 * @author Alexander Ferenets (Istamendil) <ist.kazan@gmail.com>
 */
public class StandardClasses {
  
  public static void main(String[] args) throws ParseException{
    
    // Integer class: static methods and fields
    
    System.out.println("\n-----------------------------------------\n");
    
    System.out.println(Integer.SIZE);
    System.out.println(Integer.max(5, 10));
    System.out.println(Integer.toBinaryString(138));
    System.out.println(Integer.toHexString(138));
    System.out.println(Integer.toOctalString(138));
    System.out.println(Integer.valueOf("10001010", 2));
    
    System.out.println("\n-----------------------------------------\n");
    
    // Math class
    System.out.println(Math.PI);
    System.out.println(Math.sqrt(625));
    System.out.println(Math.cbrt(-125));
    System.out.println(Math.signum(-59));
    
    System.out.println("\n-----------------------------------------\n");
    
    // System class
    System.out.println(System.currentTimeMillis());
    System.out.println(System.getenv("PATH"));
    System.out.println(System.getenv("LANG"));    
    System.out.println(System.getProperty("java.version"));    
    System.out.println(System.getProperty("java.home"));    
    System.out.println(System.getProperty("java.io.tmpdir"));    
    System.out.println(System.getProperty("os.name"));    
    System.out.println(System.getProperty("os.version"));
    System.out.println(System.getProperty("user.name"));    
    System.out.println(System.getProperty("user.home"));    
    System.out.println(System.getProperty("user.dir"));    
    System.out.println(System.getProperty("line.separator").equals("\n"));
    
    System.out.format("PI equals %.2f", Math.PI);
    System.gc();
    
    
    System.out.println("\n-----------------------------------------\n");
    
    // Calendar, TimeZone and Locale classes
    
    Calendar a = Calendar.getInstance(TimeZone.getDefault(), new Locale("ru", "RU"));
    System.out.println(a.getTimeInMillis());
    System.out.println(a.getTime());
    
    System.out.println("\n-----------------------------------------\n");
    
    // Arrays
    
    int b[] = new int[10];
    System.out.println(b.length);
    
    System.out.println("\n-----------------------------------------\n");
    
    
    
    
  }
}