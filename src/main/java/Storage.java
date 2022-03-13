public interface Storage {

    enum Unit {
        BYTE, KILOBYTE, MEGABYTE, GIGABYTE
    }

    Integer getStorageCapacity(Unit unit);
}
