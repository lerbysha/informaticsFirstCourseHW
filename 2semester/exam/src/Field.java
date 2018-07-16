import java.io.DataInputStream;
import java.util.HashMap;
import java.util.Map;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Field<K, E> {
    private static Map< Integer , Integer > map = new HashMap<>();
    private static Logger log = Logger.getLogger(Field.class.getName());
    public void method() throws FileNotFoundException, IOException{
        try ( DataInputStream dis = new DataInputStream( new FileInputStream("input.txt"))){
            int a = dis.readInt();
            while ( a != 0 ){
                if( map.containsKey(a)) {
                    map.put(a , map.get(a) + 1 );
                }
                else{
                    map.put(a , 1);
                }
                a--;
            }
        }
        catch ( FileNotFoundException fnfe ){
            log.log(Level.INFO, "file not found");
        }
        catch ( IOException ioe){
            log.log(Level.INFO, "smth happened");
        }

    }
    public static void main(String[] args) {
        map.entrySet().forEach(set -> {
            Integer key = set.getKey();
            Integer value = set.getValue();
            System.out.println(key + ":" + value);
        });
    }

    public static Map<Integer, Integer> getMap() {
        return map;
    }

    public static void setMap(Map<Integer, Integer> map) {
        Field.map = map;
    }
}
