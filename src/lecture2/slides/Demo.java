package lecture2.slides;

import lecture2.slides.element.Image;
import lecture2.slides.element.Menu;
import lecture2.slides.element.TextBox;

public class Demo {
    public static void main(String[] args) {
        TextBox tb1 = new TextBox(10, 2, "First text box", 1024);
        TextBox tb2 = new TextBox(10, 20, "Second text box", 2000);
        Menu fileMenu = new Menu(20, 50, "File Menu");
        fileMenu.addOption("Open");
        fileMenu.addOption("Save as");
        Image crocodile = new Image(512, 512, "Crocodile picture", "croc.jpg");

        DocumentManager dm = new DocumentManager();
        dm.addPageElement(tb1);
        dm.addPageElement(tb2);
        dm.addPageElement(fileMenu);
        dm.addPageElement(crocodile);

        System.out.println("Maximum height of page element: " + dm.maxHeight());
        System.out.println("File menu is taller than crocodile: " + DocumentManager.tallerThan(fileMenu, crocodile));
    }
}
