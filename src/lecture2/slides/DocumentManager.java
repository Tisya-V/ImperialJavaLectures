package lecture2.slides;

import lecture2.slides.element.PageElement;

import java.util.HashSet;
import java.util.Set;

public class DocumentManager {
    private final Set<PageElement> pageElements;

    public DocumentManager() {
        pageElements = new HashSet<>();
    }

    public void addPageElement(PageElement element) {
        boolean isPresent = pageElements.stream().anyMatch(e -> e.getId().equals(element.getId()));
        if (isPresent)
            throw new RuntimeException("Duplicate page element ids");

        pageElements.add(element);
    }

    public int maxHeight() {
        int maxHeight = -1;
        for (PageElement e : pageElements) {
            maxHeight = Math.max(maxHeight, e.getHeight());
        }
        return maxHeight;
    }

    public static boolean tallerThan(PageElement self, PageElement other) {
        return self.getHeight() > other.getHeight();
    }
}
