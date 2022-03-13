public interface Storage {
    /**
     * Enum for storage units
     */
    enum Unit {
        BYTE, KILOBYTE, MEGABYTE, GIGABYTE
    }

    Integer getStorageCapacity(Unit unit);
}
