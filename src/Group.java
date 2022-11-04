public class Group {

    String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Group(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Group: " + name;
    }
}
