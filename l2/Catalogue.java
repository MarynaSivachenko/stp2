package stp2.l2;


import java.util.HashSet;
import java.util.Set;

public class Catalogue implements Files {
    String name;
    double size = 0;
    Set<Files> files = new HashSet<Files>();

    Catalogue(String name){
        this.name = name;
    }

    @Override
    public double getSize() {
        for(Files file : files){
            size += file.getSize();
        }
        return size;
    }

    @Override
    public String getName() {
        return name + " catalogue";
    }

    public void addFiles(Files someFile){
      if(files.add(someFile)){
          System.out.println(someFile.getName() + "Was added successfully");
      }
      else{
          System.out.println("Catalogue " + this.name + " already has " + someFile.getName());
      }
    }

    public void removeFiles(Files someFile){
        if(files.remove(someFile)){
            System.out.println(someFile.getName() + "Was removed successfully");
        }
        else{
            System.out.println("Catalogue " + this.name + " does not have " + someFile.getName());
        }
    }

    public void print(){
        for(Files file : files){
            file.getName();
        }
    }
}
