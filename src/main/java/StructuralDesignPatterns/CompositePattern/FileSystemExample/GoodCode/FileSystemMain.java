package StructuralDesignPatterns.CompositePattern.FileSystemExample.GoodCode;

public class FileSystemMain {
    public static void main(String[] args) {
        Directory root = new Directory("Root");
        
        FileSystemItem file1 = new File("resume.pdf", 200);
        FileSystemItem file2 = new File("photo.jpg", 1500);
        
        Directory workDir = new Directory("Work");
        workDir.addItem(new File("project.docx", 500));
        workDir.addItem(new File("data.csv", 800));
        
        root.addItem(file1);
        root.addItem(file2);
        root.addItem(workDir);

        System.out.println("--- File System Hierarchy ---");
        root.showDetails();
        
        System.out.println("\nTotal Size of Root: " + root.getSize() + "KB");
        System.out.println("Total Size of Work Directory: " + workDir.getSize() + "KB");
    }
}
