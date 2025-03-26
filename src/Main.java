import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        QuestionBank questionBank = new QuestionBank();
        QuestionLoader.loadQuestions(questionBank);

        GameBoard gameBoard = new GameBoard(4,4);

        List<Player> players = new ArrayList<>();

        players.add(new Player("Stefano"));
        players.add(new Player("Giancarlo"));
        players.add(new Player("Gerry Scotti"));

        Game game = new Game(players, gameBoard, questionBank);


        game.start();

    }
}
