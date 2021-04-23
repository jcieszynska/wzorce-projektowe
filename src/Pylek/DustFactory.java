package Pylek;

import java.util.HashMap;
import java.util.Map;

public class DustFactory {
    private final Map<String, Dust> dusts = new HashMap<>();

    public Dust getDust(String key) {
        Dust dust = this.dusts.get(key);
        if (dust == null) {
            this.dusts.put(key, new SpecificDust(key));
        }
        return this.dusts.get(key);
    }
}
