import org.json.JSONObject;
import org.json.XML;

public class Adapter {
    private OldSystem oldSystem;

    public Adapter(OldSystem oldSystem) {
        this.oldSystem = oldSystem;
    }

    public String getEmployeeDataJSON() {
        String xmlData = oldSystem.getEmployeeDataXML();
        JSONObject jsonData = XML.toJSONObject(xmlData); // this will convert the XML to JSON
        return xmlData;
    }
}
