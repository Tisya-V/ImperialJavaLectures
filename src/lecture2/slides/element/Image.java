package lecture2.slides.element;

public class Image implements PageElement {

    private final int width;
    private final int height;
    private final String id;
    private final String src;

    public Image(int width, int height, String id, String src) {
        this.width = width;
        this.height = height;
        this.id = id;
        this.src = src;
    }

    public String getSrc() {
        return src;
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
