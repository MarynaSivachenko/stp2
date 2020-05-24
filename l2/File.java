package stp2.l2;

public class File implements Files {
    String name;
    double size;

    File(String name, double size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public double getSize() {
        return size;
    }

    @Override
    public String getName() {
        return name + " file";
    }
}
