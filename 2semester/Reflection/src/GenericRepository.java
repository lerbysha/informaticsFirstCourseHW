
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class GenericRepository<T> {
    private static Logger logger = Logger.getLogger(GenericRepository.class.getName());
    private Map<String, String> values;

    private Map<String, String> getAsMap(T o) {
        Class<T> c = (Class<T>) o.getClass();
        Field[] fields = c.getDeclaredFields();
        values = new HashMap<>();
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                values.put(field.getName(), field.get(o).toString());
            } catch (IllegalAccessException e) {
                logger.log(Level.WARNING,  "IOException: ", e);
            }
        }
        logger.info("INI getting completed.");
        return values;
    }

    public void save(File file, T o) {
        try (FileWriter writer = new FileWriter(file)) {
            values = getAsMap(o);
            for (String value : values.keySet()) {
                writer.write(value + " = " + values.get(value) + "\n");
            }
        } catch (IOException e) {
            logger.log(Level.WARNING, "Couldn't write object in file.: ", e);
        }
    }

    public T read(File file, Class<?> cls) {
        T obj = (T) new Object();
        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
            method.setAccessible(true);
            String methodName = method.getName();
            if (!methodName.startsWith("set")) {
                continue;
            }
            String field = methodName.substring(methodName.indexOf("set") + 3).toLowerCase();
            if (!values.containsValue(field)) {
                continue;
            }
            String value = values.get(field);
            try {
                method.invoke(obj, convert(String.class, value));
            } catch (IllegalAccessException e) {
                logger.log(Level.SEVERE,e.getMessage(), e);
            } catch (InvocationTargetException e) {
                logger.log(Level.WARNING, "IOException: ", e);
            }
        }
        return obj;
    }

    private Object convert(Class<?> target, String s) {
        if (target == String.class) {
            return s;
        }
        if (target == Character.class || target == char.class) {
            return s.charAt(0);
        }
        if (target == Byte.class || target == byte.class) {
            return Byte.parseByte(s);
        }
        if (target == Short.class || target == short.class) {
            return Short.parseShort(s);
        }
        if (target == Integer.class || target == int.class) {
            return Integer.parseInt(s);
        }
        if (target == Long.class || target == long.class) {
            return Long.parseLong(s);
        }
        if (target == Float.class || target == float.class) {
            return Float.parseFloat(s);
        }
        if (target == Double.class || target == double.class) {
            return Double.parseDouble(s);
        }
        if (target == Boolean.class || target == boolean.class) {
            return Boolean.parseBoolean(s);
        }
        if (target == Object.class || target == String.class || s == null) {
            return s;
        }
        throw new IllegalArgumentException("Don't know how to convert to " + target);
    }
}