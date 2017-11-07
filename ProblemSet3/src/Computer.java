public class Computer extends Memory implements IDable {

    private String id;
    private String make;
    protected Memory memory;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public String toString() {
        return String.format("%-20s%s\n%-20s%s", "ID: ", getId(), "Make: ", getMake() + getMemory());
    }

    public Computer() {
        this("", "", new Memory());
    }

    public void setID(String id) {
        setID(id);
    }

    public Computer(String id, String make, Memory memory) {
        setId(id);
        setMake(make);
        setMemory(memory);
    }
}
