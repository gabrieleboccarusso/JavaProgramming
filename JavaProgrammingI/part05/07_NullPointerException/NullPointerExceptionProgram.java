import java.util.ArrayList;

public class NullPointerExceptionProgram {
    public static void main(String[] args) {
        ArrayList<String> lines = null;
        lines.get(1);
    }
}
