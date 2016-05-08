package in.cycorax.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Read int n from STDIN
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
	    // Write your code here
	    System.out.println(n * 2);
	    System.out.println(s);
    }
}

