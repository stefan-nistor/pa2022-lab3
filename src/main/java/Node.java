import java.util.HashMap;
import java.util.Map;

public class Node{

    private String name;
    private Map<Node, Integer> cost = new HashMap<>();

    public Node(){

    }

    public Node(String name){
        this.name = name;
    }

    public Node(String name, Map<Node, Integer> cost){
        this.name = name;
        this.cost = cost;
    }

    public Map<Node, Integer> getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public void setCost(Node node, int value) {
        cost.put(node, value);
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }

}
