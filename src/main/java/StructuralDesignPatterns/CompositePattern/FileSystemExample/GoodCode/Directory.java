package StructuralDesignPatterns.CompositePattern.FileSystemExample.GoodCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite: Directory that can contain both Files and other Directories.
 */
public class Directory implements FileSystemItem {
    private String name;
    private List<FileSystemItem> items = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void addItem(FileSystemItem item) {
        items.add(item);
    }

    @Override
    public void showDetails() {
        System.out.println("Directory: " + name);
        for (FileSystemItem item : items) {
            item.showDetails();
        }
    }

    @Override
    public int getSize() {
        int totalSize = 0;
        for (FileSystemItem item : items) {
            totalSize += item.getSize();
        }
        return totalSize;
    }
}
