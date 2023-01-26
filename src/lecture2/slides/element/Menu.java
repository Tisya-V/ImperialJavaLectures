package lecture2.slides.element;

import java.util.ArrayList;
import java.util.List;

public class Menu implements PageElement {

    private final int width;
    private final int height;
    private final String id;
    private List<String> options;

    public Menu(int width, int height, String id) {
        this.width = width;
        this.height = height;
        this.id = id;
        this.options = new ArrayList<>();
    }

    public void addOption(String option) {
        options.add(option);
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public String getId() {
        return id;
    }
}
