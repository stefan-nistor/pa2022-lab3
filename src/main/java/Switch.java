public class Switch extends Node {

    Switch(String name){
        this.setName(name);
    }

    @Override
    public String toString() {
        return "Switch{" +
                "name='" + getName() + '\'' +
                ", MAC=" + getMacAddress() +
                '}';
    }
}
