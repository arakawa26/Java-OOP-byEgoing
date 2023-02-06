interface Calculable{
    double PI = 3.14; // interface 에서 선언된 변수는 그 interface를 구현한 class 에서는 따로 선언할 필요없이 가지게됨.
    int sum(int v1, int v2);
}
interface Printable{
    void print();
}
class RealCal implements Calculable, Printable { // 하나의 class 는 여러개의 interface를 구현가능
    public int sum(int v1, int v2) {
        return v1 + v2;
    }
    public void print(){
        System.out.println("this is RealCal");
    }
}
public class InterfaceApp {
    public static void main(String[] args) {
        RealCal p1 = new RealCal(); // 앞서 정의한 RealCal 클래스를 그대로 가져옴
        System.out.println(p1.sum(2,1));
        p1.print();

        Calculable p2 = new RealCal(); // RealCal 클래스에서 Calculable 인터페이스에 속한 메소드들만 가져옴
        System.out.println(p2.sum(2,1));
        // p2.print(); // print 는 Printable 인터페이스의 메소드이기 때문에 사용불가

        Printable p3 = new RealCal(); // RealCal 클래스에서 Printable 인터페이스에 속한 메소드들만 가져옴
        // System.out.println(p3.sum(2,1)); // sum 은 Calculable 인터페이스의 메소드이기 때문에 사용불가
        p3.print();
    }
}
