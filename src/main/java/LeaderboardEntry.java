

import java.util.ArrayList;
// Games are a list of passes or fails 
public record LeaderboardEntry(String name, ArrayList<Boolean> games) {

    public Double getAvgGuesses(){
        return (double) (this.games.stream().count() / this.games.stream().filter((game) -> (game == true)).count());
    }
}
