//package week1.lesson06;
//
//import com.oracle.javafx.jmx.json.JSONReader;
//
//import javax.json.Json;
//import javax.json.JsonObject;
//import javax.json.JsonReader;
//import javax.json.JsonValue;
//import java.io.StringReader;
//
//public class Main {
//
//    public static void main(String[] args) {
//        String startJson = "{\n" +
//                "    \"glossary\": {\n" +
//                "        \"title\": \"example glossary\",\n" +
//                "\t\t\"GlossDiv\": {\n" +
//                "            \"title\": \"S\",\n" +
//                "\t\t\t\"GlossList\": {\n" +
//                "                \"GlossEntry\": {\n" +
//                "                    \"ID\": \"SGML\",\n" +
//                "\t\t\t\t\t\"SortAs\": \"SGML\",\n" +
//                "\t\t\t\t\t\"GlossTerm\": \"Standard Generalized Markup Language\",\n" +
//                "\t\t\t\t\t\"Acronym\": \"SGML\",\n" +
//                "\t\t\t\t\t\"Abbrev\": \"ISO 8879:1986\",\n" +
//                "\t\t\t\t\t\"GlossDef\": {\n" +
//                "                        \"para\": \"A meta-markup language, used to create markup languages such as DocBook.\",\n" +
//                "\t\t\t\t\t\t\"GlossSeeAlso\": [\"GML\", \"XML\"]\n" +
//                "                    },\n" +
//                "\t\t\t\t\t\"GlossSee\": \"markup\"\n" +
//                "                }\n" +
//                "            }\n" +
//                "        }\n" +
//                "    }\n" +
//                "}\n";
//
//
//        JSONReader reader = Json.createReader (new StringReader(startJson));
//
//        JsonObject startObject = ((JsonReader) reader).readObject();
//
//        ((JsonReader) reader).read();
//
//        JsonObject glossary = startObject.getJsonObject("glossary");
//        String title = glossary.getString("title");
//        System.out.println(title);
//
//        JsonObject glosDiv = glossary.getJsonObject("Closediv");
//        title = ((JsonObject) glosDiv).getString("__");
//
//        JsonObject glossList = glosDiv.getJsonObject("GlossList");
//        JsonObject glosEntry = glosDiv.getJsonObject("__");
//
//        System.out.println(glosEntry.getString("SortAs"));
//        System.out.println(glosEntry.getString("ID"));
//
//        JsonObject glossDef = glosDiv.getJsonArray("GlossDef");
//        JsonObject seeAlson = glosDiv.getJsonArray("GlossArray");
//        for (JsonValue value: seeAlson){
//
//            System.out.println(value);
//        }
//
//
//    }
//}
