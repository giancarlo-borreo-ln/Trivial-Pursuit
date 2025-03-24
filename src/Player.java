import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private int position=0;
    private List<JavaTopic> punti = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public Player(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public List<JavaTopic> getPunti() {
        return punti;
    }

    public void addPunto(JavaTopic topic){
        if(!punti.contains(topic)){
            punti.add(topic);
        }
    }

    public boolean verificaVittoria(){
        return punti.size() == JavaTopic.values().length;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", position=" + position +
                ", punti=" + punti +
                '}';
    }
}
