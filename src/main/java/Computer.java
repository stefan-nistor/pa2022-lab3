public class Computer extends Node implements Identifiable, Storage{

    private String address;
    private Integer storageCapacity;

    public void setAddress(String address) {
        this.address = address;
    }

    public void setStorageCapacity(Integer storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public Integer getStorageCapacity(Unit unit) {
        return switch (unit) {
            case GIGABYTE -> storageCapacity;
            case MEGABYTE -> storageCapacity * 1000;
            case KILOBYTE -> storageCapacity * 1_000_000;
            case BYTE -> storageCapacity * 1_000_000_000;
        };
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + getName() + '\'' +
                ", IP='" + address + '\'' +
                ", MAC=" + getMacAddress() +
                ", storageCapacity=" + storageCapacity +
                '}';
    }
}
