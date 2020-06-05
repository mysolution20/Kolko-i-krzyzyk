import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameConstant {
    static String gameName = "Tic-tac-toe";
    static List<List<Integer>> possibleWins = new ArrayList<>();

    static {
        possibleWins.add(Arrays.asList(1, 2, 3));
        possibleWins.add(Arrays.asList(4, 5, 6));
        possibleWins.add(Arrays.asList(7, 8, 9));
        possibleWins.add(Arrays.asList(1, 4, 7));
        possibleWins.add(Arrays.asList(2, 5, 8));
        possibleWins.add(Arrays.asList(3, 6, 9));
        possibleWins.add(Arrays.asList(1, 5, 9));
        possibleWins.add(Arrays.asList(3, 5, 7));
    }
}
