package pl.lublin.wsei.java.cwiczenia.lab4.test;

import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Exception;
import java.io.IOException;
import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.awt.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
public class TestFileRead {

// program próbowałem zrobić na 1000 sposób każdy temat na stackoferflow związany z wczytawyaniem XMLa do stringa został przetestowany
    // nie jestem w sanie tego zrobić :/
    // miejsca w których istrukcja na początku mówi że coś zadziała mi niestety nie działało ani razu
    // udało mi sie po prostu uruchomić ten plik ale wczytać do stringa

    public class GusInfoGraphicList<Infografika> {
        public ArrayList<Infografika> infografiki;

        public GusInfoGraphicList(String gusFileName) {
            infografiki = new ArrayList<>();
            String contents;
            try {
                contents = new String(Files.readAllBytes(Paths.get(gusFileName)));
            }
            catch (I0Exception e) {
                System.out.println("Błąd wczytywania pliku gusInfoGraphic.xml => "+ e.getLocalizedMessage());
                e.printStackTrace();
                contents = "";
            }
            String[] items = contents.split("<item>");
            for (int i = 1; i < items.length; i++) {
                infografiki.add(new Infografika(items[i]));
            }
        }
    }

// private static java.awt.Desktop Desktop;
 /*       try {
//constructor of file class having file as argument
            File file = new File("C:\\Users\\SilentiumPC\\IdeaProjects\\Lab4\\src\\main\\java\\pl\\lublin\\wsei\\java\\cwiczenia\\lab4\\test\\gusInfoGraphic.xml");
            if (!Desktop.isDesktopSupported())//check if Desktop is supported by Platform or not
            {
                System.out.println("not supported");
                return;
            }
            Desktop desktop = Desktop.getDesktop();
            if (file.exists())         //checks file exists or not
                desktop.open(file);              //opens the specified file
        } catch (Exception e) {
            e.printStackTrace();
        }
*/   }









