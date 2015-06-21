package haychokho.colokenandroid.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static List<DummyItem> TERMINAL = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, DummyItem> TERMINAL_MAP = new HashMap<String, DummyItem>();

    static {
        // Add 3 sample items.
        addItem(new DummyItem("1", "Ruang Keluarga"));
        addItem(new DummyItem("2", "Ruang Makan"));
        addItem(new DummyItem("3", "Ruang Tamu"));
        addItem(new DummyItem("3", "Kamar Farrel"));
        addItem(new DummyItem("3", "Kamar Jojo"));
        addItem(new DummyItem("3", "Kamar Ayah-Ibu"));
    }

    private static void addItem(DummyItem item) {
        TERMINAL.add(item);
        TERMINAL_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public String id;
        public String content;

        public DummyItem(String id, String content) {
            this.id = id;
            this.content = content;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
