public class Main {
    public static void main(String[] args) {

        Computer v1 = new Computer();
        v1.setName("Computer A");
        v1.setMacAddress("AA-00-04-00-XX-YY");
        v1.setStorageCapacity(1024);
        v1.setAddress("123.24.4.96");

        Router v2 = new Router("Router A");
        v2.setAddress("23.44.58.04");
        v2.setMacAddress("fe-25-43-02-AD-GF");

        Switch v3 = new Switch("Switch A");
        v3.setMacAddress("58-13-AA-6A-2A-AD");

        Switch v4 = new Switch("Switch B");
        v4.setMacAddress("70-23-21-96-55-80");

        Router v5 = new Router("Router B");
        v5.setAddress("1.89.90.45");
        v5.setMacAddress("B5-8F-8A-5E-19-29");

        Computer v6 = new Computer();
        v6.setName("Computer B");
        v6.setMacAddress("7F-EB-09-CB-3C-C4");
        v6.setStorageCapacity(512);
        v6.setAddress("78.102.12.63");

        v1.setCost(v2, 10);
        v1.setCost(v3, 50);
        v2.setCost(v3, 20);
        v2.setCost(v4, 20);
        v2.setCost(v5, 10);
        v3.setCost(v4, 20);
        v4.setCost(v5, 30);
        v4.setCost(v6, 10);
        v5.setCost(v6, 20);

        Network network = new Network();

        network.addNode(v1);
        network.addNode(v2);
        network.addNode(v3);
        network.addNode(v4);
        network.addNode(v5);
        network.addNode(v6);

        System.out.println(network.getNodes().toString());

        // print network nodes without their cost map
        network.getNodes().forEach(node -> System.out.println(node.getName()));

        // print network nodes with their cost map
        network.getNodes().forEach(
                node -> node.getCost().forEach((key, value) -> System.out.println(node.getName() + "\t -- " + key.getName() + '\t' + value))
        );

        network.printIdentifiableNodes();

    }
}
