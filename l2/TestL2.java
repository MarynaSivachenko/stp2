package stp2.l2;

public class TestL2 {
    public static void main(String[] args) {
        Catalogue catalogue1 = new Catalogue("cat1");
        File file1 = new File("f1", 12.3);
        Catalogue catalogue2 = new Catalogue("cat2");
        catalogue2.addFiles(file1);
        catalogue1.addFiles(file1);
        catalogue1.addFiles(catalogue2);
        System.out.println(file1.getSize());
        System.out.println(catalogue1.getSize());
    }
}
