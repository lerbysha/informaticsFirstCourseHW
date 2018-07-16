package ru.kpfu.itis.DB;


import static ru.kpfu.itis.DB.Manage.*;


public class App {
        public static void main(String[] args) {
            Student dilyara = new Student("Dilyara", false, (byte) 18);
            String pathAPI = "dataAPI.txt";
            String path = "data.txt";

            writeObjectWithAPI(dilyara, pathAPI);
            System.out.println("API: " + readObjectWithAPI(pathAPI));
            writeObject(dilyara, path);
            System.out.println("nonAPI: " + readObject(path));

        }


}

