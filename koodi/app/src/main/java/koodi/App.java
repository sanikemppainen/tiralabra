/*
 * Open html file in browser
 */
package koodi;

import java.awt.Desktop;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {

    public static void main(String[] args) {
        Path path= Paths.get("app/src/index.html");
        String htmlPath = path.toString();
        openInBrowser(htmlPath);
    }

    public static void openInBrowser(String htmlPath){
        try {
            File htmlFile= new File(htmlPath);
            Desktop.getDesktop().browse(htmlFile.toURI());

        } catch (Exception e){
            System.out.println("couldn't open html file in browser: "+ e);
        }
    }
   

}
