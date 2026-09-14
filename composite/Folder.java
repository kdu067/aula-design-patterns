import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent {

    private final String name;
    private final List<FileSystemComponent> components = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(FileSystemComponent component) {
        components.add(component);
    }

    public void remove(FileSystemComponent component) {
        components.remove(component);
    }

    public List<FileSystemComponent> getComponents() {
        return components;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public long getSize() {
        long totalSize = 0;
        for (FileSystemComponent component : components) {
            totalSize += component.getSize();
        }
        return totalSize;
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "+ [Folder] " + name + " (Total: " + getSize() + " KB)");
        for (FileSystemComponent component : components) {
            component.display(indent + "  ");
        }
    }
}
