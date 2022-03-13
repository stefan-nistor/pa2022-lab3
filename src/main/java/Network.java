import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Network {

    private List<Node> nodes = new ArrayList<>();

    public List<Node> getNodes() {
        return nodes;
    }

    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

    public void addNode (Node node){
        nodes.add(node);
    }

    public void deleteNode (Node node){
        nodes.remove(node);
    }

    public void printNodes(){
        nodes.forEach(node -> System.out.println(node.getName()));
    }

    public void printNodes(@NotNull List<Node> nodes){
        nodes.forEach(node -> System.out.println(node.getName()));
    }

    public void printIdentifiableNodes() {
        var identifiableNodes = nodes.stream()
                .filter(node -> node instanceof Identifiable)
                .sorted()
                .collect(Collectors.toList());
        printNodes(identifiableNodes);
    }

    public List<Node> getIdentifiableNodes(){
        return nodes.stream().filter(node -> node instanceof  Identifiable)
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "Network{" +
                "nodes=" + nodes +
                '}';
    }

}
