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
    public Integer getStorageCapacity() {
        return storageCapacity;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "address='" + address + '\'' +
                ", storageCapacity=" + storageCapacity +
                '}';
    }
}
