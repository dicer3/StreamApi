import java.util.HashMap;
import java.util.Map;

final class Immutable {
    private final String name;
    private final int regNo;
    final Map<String, String> metadata;

    Immutable(String name, int regNo, Map<String, String> metadata){
        this.name = name;
        this.regNo = regNo;
        Map<String, String> tempData = new HashMap<>();
        for(Map.Entry<String, String> entry : metadata.entrySet()){
            tempData.put(entry.getKey(),entry.getValue());
        }
        this.metadata = tempData;
    }
}
