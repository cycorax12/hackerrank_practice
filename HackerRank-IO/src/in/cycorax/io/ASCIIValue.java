package in.cycorax.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Given character, it prints the ASCII value for it.
 * @author Virendra
 *
 */
public class ASCIIValue {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String s = br.readLine();
			Character c = s.charAt(0);
			System.out.println((int) c);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
