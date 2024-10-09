import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ColorFill {
	public static void main(String[] args) throws IOException {
		ArrayList<Tile> prevRow = new ArrayList<>();
		ArrayList<Tile> curRow = new ArrayList<>();
		int colorCount = 0;
		InputStream stream = ColorFill.class.getResourceAsStream("/map/sample.txt");
		InputStreamReader reader = new InputStreamReader(stream);
		BufferedReader bufferedReader = new BufferedReader(reader);
		String line = "";
		int row = 0;
		while ((line = bufferedReader.readLine()) != null) {
			String[] tileWidths = line.split(",");
			for (int i = 0, total = 0; i < tileWidths.length; i++) {
				int width = Integer.parseInt(tileWidths[i]);
				curRow.add(new Tile(row, total, width));

				total += width;
				if (total > 1600) {
					System.out.println("Invalid input.");
					return;
				}
			}
			row++;
		}
	}
}
