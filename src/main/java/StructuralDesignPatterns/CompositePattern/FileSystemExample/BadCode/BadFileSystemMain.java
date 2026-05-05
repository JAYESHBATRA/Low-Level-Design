package StructuralDesignPatterns.CompositePattern.FileSystemExample.BadCode;

import java.util.ArrayList;
import java.util.List;

class File {
    private String name;
    private int size;
    public File(String name, int size) { this.name = name; this.size = size; }
    public String getName() { return name; }
    public int getSize() { return size; }
}

class Directory {
    private String name;
    private List<File> files = new ArrayList<>();
    private List<Directory> subDirectories = new ArrayList<>();

    public Directory(String name) { this.name = name; }
    public String getName() { return name; }
    public void addFile(File file) { files.add(file); }
    public void addDirectory(Directory dir) { subDirectories.add(dir); }

    public int calculateTotalSize() {
        int total = 0;
        System.out.println("Processing directory: " + name);
        for (File f : files) {
            System.out.println("  Counting file: " + f.getName());
            total += f.getSize();
        }
        for (Directory d : subDirectories) {
            total += d.calculateTotalSize();
        }
        return total;
    }
}

public class BadFileSystemMain {
    public static void main(String[] args) {
        Directory root = new Directory("root");
        root.addFile(new File("file1.txt", 100));
        
        Directory music = new Directory("music");
        music.addFile(new File("song.mp3", 500));
        
        root.addDirectory(music);

        System.out.println("Total Size: " + root.calculateTotalSize());
    }
}
