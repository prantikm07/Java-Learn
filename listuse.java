import java.util.ArrayList;
import java.util.List;

public class listuse {

    public static void main(String[] args) {
	
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        
        for (int i = 0; i< arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}