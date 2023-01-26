package lecture2.slides.element;

public class TextBox implements PageElement {

    private final int width;
    private final int height;
    private final String id;
    private final int maxChars;

    public TextBox(int width, int height, String id, int maxChars) {
        this.width = width;
        this.height = height;
        this.id = id;
        this.maxChars = maxChars;
    }

    public int getMaxChars() {
        return maxChars;
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
