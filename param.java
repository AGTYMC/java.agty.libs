package agty.libs;

import java.util.HashMap;

public class param {
    private HashMap<String, String> $array = new HashMap<String, String>();

    public param put(String name, String value) {
        $array.put(name, value);
        return this;
    }

    public String get(String name) {
        return $array.get(name);
    }

    public void clear() {
        $array.clear();
        $array = null;
    }

    public HashMap instance() {
        return this.$array;
    }
}
