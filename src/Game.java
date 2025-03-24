import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    private List<Player> players = new ArrayList<>();
    private GameBoard board;
    private QuestionBank questionBank;
    private Dice dice;
    private int currentPlayerIndex;
    private Scanner scanner;

    public Game(List<Player> players, GameBoard board, QuestionBank questionBank, Dice dice, int currentPlayerIndex, Scanner scanner) {
        this.players = players;
        this.board = board;
        this.questionBank = questionBank;
        this.dice = dice;
        this.currentPlayerIndex = currentPlayerIndex;
        this.scanner = scanner;
    }

    public void Start(){
        System.out.println("Benvenuti al java trivial pursuit: ");
        boolean gameEnded = false;
        while(!gameEnded) {
            Player currentPlayer = players.get(currentPlayerIndex);
            System.out.println("\nTurno di: " + currentPlayer.getName());
            System.out.println(currentPlayer);

            int roll = dice.roll();
            System.out.println(currentPlayer.getName() + " ha tirato un: " + roll);

            int newRow = (currentPlayer.getPosition() / board.getCols() + roll) % board.getRows();

            int newCols = (currentPlayer.getPosition() / board.getCols() + roll) % board.getCols();

            currentPlayer.setPosition(newRow * board.getCols() + newCols);

            JavaTopic topic = board.getTopicAt(newRow, newCols);
            System.out.println("Sei finito sulla categoria: " + topic);

            Question question = questionBank.getRandomQuestion(topic);

            if(question == null){
                System.out.println("Non ci sono domande disponibili per questo argomento");
            }else{
                System.out.println("Domanda: " + question.getQuestionText());
                System.out.println("Risposta: ");
                String answer = scanner.nextLine();

                if(answer.equals(question.getAnswerText())){
                    System.out.println("Risposta corretta! Congratulazioni hai vinto un punto e ti avvicini di un punto a vincere la sagra del cinghiale");
                    currentPlayer.addPunto(topic);
                    if(currentPlayer.verificaVittoria()){
                        System.out.println("Hai vinto la sagra del cinghiale!");
                        gameEnded = true;
                        continue;
                    }else{
                        System.out.println("Risposta errata la risposta corretta era: " + question.getAnswerText());
                    }
                }

                currentPlayerIndex = (currentPlayerIndex+1)%players.size();
            }

            System.out.println("Partita terminata. Grazie per avere giocato");
        }
    }
}
