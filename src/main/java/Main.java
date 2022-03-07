public class Main {
    public static void main(String[] args) {

        Network network = new Network();

        Node v1 = new Node("v1");
        Node v2 = new Node("v2");
        Node v3 = new Node("v3");
        Node v4 = new Node("v4");
        Node v5 = new Node("v5");
        Node v6 = new Node("v6");

        v1.setCost(v2, 10);
        v1.setCost(v3, 50);

        v2.setCost(v3, 20);
        v2.setCost(v4, 20);
        v2.setCost(v5, 10);

        v3.setCost(v4, 20);

        v4.setCost(v5, 30);
        v4.setCost(v6, 10);

        v5.setCost(v6, 20);

        network.addNode(v1);
        network.addNode(v2);
        network.addNode(v3);
        network.addNode(v4);
        network.addNode(v5);
        network.addNode(v6);

        System.out.println(network.getNodes().toString());

        network.getNodes().forEach(node -> System.out.println(node.getName()));

    }
}
