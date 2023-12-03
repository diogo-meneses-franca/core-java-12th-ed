import org.example.employee.Size;
import static org.example.employee.Size.SMALL;

public class SwitchCase {
    public static void main(String[] args) {
        Size itemSize = SMALL, MEDIUM, LARGE, EXTRA_LARGE;
        String label = switch (itemSize)
        {
            case SMALL -> "S";
            case LARGE -> "L";
            case MEDIUM -> "M";
            case EXTRA_LARGE -> "EL";
        };


    }
}
