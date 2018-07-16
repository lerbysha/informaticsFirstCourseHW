import java.io.File;

public class ReflectionDemo {
    public static void main(String[] args) {
        Product product = new Product("Milk", 56);
        Student student = new Student("Will", 18);
        File productsFile = new File("src/main/resources/products.txt");
        File studentsFile = new File("src/main/resources/students.txt");

        GenericRepository<Product> productRepo = new GenericRepository<>();
        productRepo.save(productsFile, product);
        System.out.println(productRepo.read(productsFile, Product.class));

        GenericRepository<Student> studentRepo = new GenericRepository<>();
        studentRepo.save(studentsFile, student);
    }
}