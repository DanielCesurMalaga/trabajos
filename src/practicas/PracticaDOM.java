package practicas;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.Text;

public class PracticaDOM {
    public static void main(String[] args) {

        try {
            DocumentBuilderFactory factoriaDOC = DocumentBuilderFactory.newInstance();
            DocumentBuilder constructor = factoriaDOC.newDocumentBuilder();
            Document doc = constructor.newDocument();

            Element root = doc.createElement("Users");
            doc.appendChild(root);

            root.appendChild(createUser(doc, "1", "Adrian", "Ungureanu", "estudiante"));
            root.appendChild(createUser(doc, "2", "Daniel", "Fernandez", "quien sabe"));

            TransformerFactory factoriaTransf = TransformerFactory.newInstance();
            Transformer transformador = factoriaTransf.newTransformer();

            transformador.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformador.setOutputProperty(OutputKeys.INDENT, "yes");
            transformador.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");

            DOMSource fuente = new DOMSource(doc);

            File miFichero = new File("user.xml");

            StreamResult consola = new StreamResult(System.out);
            StreamResult fichero = new StreamResult(miFichero);

            transformador.transform(fuente, fichero);
            transformador.transform(fuente, consola);

        } catch (ParserConfigurationException e) {
            System.out.println(e.getMessage());
        } catch (TransformerConfigurationException e) {
            System.out.println(e.getMessage());
        } catch (TransformerException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Node createUser(Document doc, String id, String firstName, String lastName, String occupation) {

        Element user = doc.createElement("user");
        
        user.setAttribute("id", id);
        user.appendChild(createUserElement(doc, "firstName", firstName));
        user.appendChild(createUserElement(doc, "lastName", lastName));
        user.appendChild(createUserElement(doc, "occupation", occupation));

        return user;

    }

    public static Node createUserElement(Document doc, String name, String value) {

        Element nodo = doc.createElement(name);
        Text texto = doc.createTextNode(value);
        nodo.appendChild(texto);

        return nodo;

    }
}
