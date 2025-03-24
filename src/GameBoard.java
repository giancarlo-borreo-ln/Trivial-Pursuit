import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GameBoard {
    private List<List<JavaTopic>> grid=new ArrayList<>();
    private int rows;
    private int columns;

    public GameBoard(int rows, int columns){
        this.rows=rows;
        this.columns=columns;
        initializeBoard();
    }

    private void initializeBoard(){
        List<JavaTopic> poolTopics = new ArrayList<>();

        for(int i=0; i<(rows*columns) / JavaTopic.values().length + 1; i++){
            Collections.addAll(poolTopics, JavaTopic.values());
        }

        Collections.shuffle(poolTopics);

        int index=0;
        for(int i=0; i < rows; i++){
            List<JavaTopic> row = new ArrayList<>();
            for(int j=0; j < columns; j++){
                row.add(poolTopics.get(index++));
            }

            grid.add(row);
        }
    }

    public JavaTopic getTopicAt(int row, int col){
        if(row >= 0 && row < rows && col >= 0 && col<columns){
            return grid.get(row).get(col);
        }else{
            throw new IndexOutOfBoundsException();
        }
    }

    public int getRows(){
        return rows;
    }

    public int getCols(){
        return columns;
    }

    @Override
    public String toString() {
        return "GameBoard{" +
                "grid=" + grid +
                ", rows=" + rows +
                ", columns=" + columns +
                '}';
    }
}
