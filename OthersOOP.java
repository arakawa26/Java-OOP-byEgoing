import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {
    public static void main(String[] args) throws IOException {
        System.out.println(Math.PI); // PI 는 Math 클래스의 변수
        System.out.println(Math.floor(1.8)); // floor 은 Math 클래스의 메소드

        FileWriter f1 = new FileWriter("data.txt");
        f1.write("Hello");
        f1.write(" Java");
        f1.close();

        FileWriter f2 = new FileWriter("data2.txt");
        f2.write("Hello");
        f2.write(" Java2");
        f2.close();
    }
}
