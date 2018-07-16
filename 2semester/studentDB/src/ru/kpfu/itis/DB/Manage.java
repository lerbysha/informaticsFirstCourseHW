package ru.kpfu.itis.DB;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Manage {
    protected static void writeObject(Student object, String path) {
        File file = new File(Paths.get(path).toUri().normalize());

        try (OutputStream os = new FileOutputStream(file)) {
            byte[] bytes = object.getName().getBytes();
            byte[] gender = ByteBuffer.allocate(1).put((byte) (object.isMale() ? 1: 0)).array();
            byte[] age = ByteBuffer.allocate(1).put(object.getAge()).array();
            os.write(bytes);
            os.write(gender);
            os.write(age);
            os.flush();

        } catch (FileNotFoundException ex) {
            System.err.println("File not found");
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

    protected static Object readObject(String path) {
        File file = new File(path);
        try {
            byte[] data = Files.readAllBytes(file.toPath());

            String name = new String(Arrays.copyOf(ByteBuffer.wrap(data).array(), 7 ));
            boolean male = ByteBuffer.wrap(data).get(5) == 1;
            byte age = ByteBuffer.wrap(data).get(6);
            return new Student(name, male, age);
        } catch (FileNotFoundException ex) {
            System.err.println("File not found.");
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
        return null;
    }

    protected static void writeObjectWithAPI(Object object, String path) {
        File file = new File(path);
        ObjectOutputStream objectOutputStream = null;
        try (FileOutputStream fos = new FileOutputStream(file)) {
            objectOutputStream.writeObject(object);
            objectOutputStream.flush();
            objectOutputStream.close();
            fos.flush();
            fos.close();
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

    protected static Object readObjectWithAPI(String path) {
        File file = new File(path);
        ObjectInputStream objectInputStream;
        try (FileInputStream fis = new FileInputStream(file)) {
            objectInputStream = new ObjectInputStream(fis);
            Object obj = objectInputStream.readObject();
            fis.close();
            return obj;

        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
