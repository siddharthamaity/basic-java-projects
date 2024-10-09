import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Histogram {

	public static void main(String[] args) throws IOException {
		HashMap<String, Integer> values = new HashMap<>();
		HashMap<String, Boolean> present = new HashMap<>();

		BufferedReader reader = new BufferedReader(
				new InputStreamReader(Histogram.class.getResourceAsStream("/input/histogram.txt")));
		String line = "";
		while ((line = reader.readLine()) != null) {
			if (line.endsWith(":")) {
				Set<Entry<String, Boolean>> entrySet = present.entrySet();
				Iterator<Entry<String, Boolean>> iterator = entrySet.iterator();
				while (iterator.hasNext()) {
					Entry<String, Boolean> entry = iterator.next();
					if (entry.getValue() == false) {

					}
				}
			}
			if (line.startsWith("-")) {
				line = line.substring(2, line.length());
				String key = line.split(":")[0].trim();
				String value = line.split(":")[1].trim();
				System.out.println(key + " " + value);
				int prevValue = (values.get(key) == null) ? 0 : values.get(key);
				values.put(key, prevValue + 1);
				present.put(key, true);
			}
		}
	}

}
