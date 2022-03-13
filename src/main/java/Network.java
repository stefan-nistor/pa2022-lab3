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

    /**
     * Add a node to the current instance list
     * @param node node to be added to the list
     */
    public void addNode (Node node){
        nodes.add(node);
    }

    /**
     * Remove a node from current instance list
     * @param node node to be removed
     */
    public void deleteNode (Node node){
        nodes.remove(node);
    }

    /**
     * Print nodes name for current instance
     */
    public void printNodes(){
        nodes.forEach(node -> System.out.println(node.getName()));
    }

    /**
     * Print nodes name from a List of nodes given as param
     * @param nodes @NotNull List of nodes
     */
    public void printNodes(@NotNull List<Node> nodes){
        nodes.forEach(node -> System.out.println(node.getName()));
    }

    /**
     * Print all {@link Identifiable} nodes sorted by their name
     */
    public void printIdentifiableNodes() {
        var identifiableNodes = nodes.stream()
                .filter(node -> node instanceof Identifiable)
                .sorted(Node::compareTo)
                .collect(Collectors.toList());
        printNodes(identifiableNodes);
    }

    /**
     * Get a list of identifiable nodes
     * @return a list of identifiable nodes
     */
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
