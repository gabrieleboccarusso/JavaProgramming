public class MainProgram {
    public static void main(String[] args) {
        Counter counter = new Counter(1);
        counter.increase(2);
        counter.increase();
        counter.increase();
        counter.decrease(3);
        System.out.println(counter.value());
    }
}
