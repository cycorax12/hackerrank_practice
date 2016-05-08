package in.cycorax.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This class reads input from System, and goes on taking input until it finds
 * 42.
 * 
 * @author Virendra
 * 
 */
public class LifeUniverseEverything {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		try {
			while (true) {
				line = br.readLine();
				int n = Integer.parseInt(line);
				if (n == 42) {
					break;
				}
				System.out.println(n);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
