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
    public static List<AlarmItem> ALARMS = new ArrayList<AlarmItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, DummyItem> TERMINAL_MAP = new HashMap<String, DummyItem>();
    public static Map<String, AlarmItem> ALARMS_MAP = new HashMap<String, AlarmItem>();

    static {
        addItem(new DummyItem("1", "Ruang Keluarga"));
        addItem(new DummyItem("2", "Ruang Makan"));
        addItem(new DummyItem("3", "Ruang Tamu"));
        addItem(new DummyItem("4", "Kamar Farrel"));
        addItem(new DummyItem("5", "Kamar Jojo"));
        addItem(new DummyItem("6", "Kamar Ayah-Ibu"));
    }

    static {
        addItemToAlarms(new AlarmItem("1", "07:00", "08:00"));
        addItemToAlarms(new AlarmItem("2", "09:00", "10:00"));
        addItemToAlarms(new AlarmItem("3", "11:00", "12:00"));
        addItemToAlarms(new AlarmItem("4", "13:00", "14:00"));
    }

    private static void addItem(DummyItem item) {
        TERMINAL.add(item);
        TERMINAL_MAP.put(item.id, item);
    }

    private static void addItemToAlarms(AlarmItem item) {
        ALARMS.add(item);
        ALARMS_MAP.put(item.id, item);
    }

    public static String[] toStringArray(List<?> list){
        int n = list.size();
        String[] res = new String[n];
        for (int i=0; i<n; i++) {
            res[i] = list.get(i).toString();
        }
        return res;
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

    public static class AlarmItem {
        public String id;
        public String start;
        public String end;

        public AlarmItem(String id, String start, String end) {
            this.id = id;
            this.start = start;
            this.end = end;
        }

        @Override
        public String toString() {
            return "ON at " + start + " - " + end;
        }
    }
}
