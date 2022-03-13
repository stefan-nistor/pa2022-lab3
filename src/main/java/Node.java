import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public abstract class Node implements Comparable<Node>{

    private String name;
    private String macAddress;
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

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getMacAddress() {
        return macAddress;
    }

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", MAC=" + macAddress +
                '}';
    }

    @Override
    public int compareTo(@NotNull Node other) {
        if(name == null || other.name == null)
            throw new NullPointerException();

        return this.name.compareTo(other.name);
    }

}
