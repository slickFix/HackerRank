import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class MATRIX_INVERSION {
	static InputReader in = new InputReader(System.in);
	static PrintWriter w = new PrintWriter(System.out);
	
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	int n = in.nextInt();
    	int [][] mat = new int[n][n];

    	for(int i = 0;i<n;i++){
    		for(int j=0;j<n;j++){
    			int no = in.nextInt();
    			mat[i][j] =no;
    		}
    	}
    	int ans = 0;
    	for(int i =0;i<n;i++){
    		for(int j = 0;j<n;j++){
    			       for(int p =i;p<n;p++){
    	    		      for(int q = j;q<n;q++){
    	    			    if(mat[p][q]<mat[i][j])
    	    			    	ans++;
    	    		      }
    		           }
    	    }
        }
    	w.println(ans);
    	w.flush();
    }   
    static class InputReader {
    	 
		private InputStream stream;
		private byte[] buf = new byte[8192];
		private int curChar, snumChars;
		private SpaceCharFilter filter;
 
		public InputReader(InputStream stream) {
			this.stream = stream;
		}
 
		public int snext() {
			if (snumChars == -1)
				throw new InputMismatchException();
			if (curChar >= snumChars) {
				curChar = 0;
				try {
					snumChars = stream.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (snumChars <= 0)
					return -1;
			}
			return buf[curChar++];
		}
 
		public int nextInt() {
			int c = snext();
			while (isSpaceChar(c))
				c = snext();
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = snext();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = snext();
			} while (!isSpaceChar(c));
			return res * sgn;
		}
 
		public long nextLong() {
			int c = snext();
			while (isSpaceChar(c))
				c = snext();
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = snext();
			}
			long res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = snext();
			} while (!isSpaceChar(c));
			return res * sgn;
		}
 
		public int[] nextIntArray(int n) {
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}
 
		public String readString() {
			int c = snext();
			while (isSpaceChar(c))
				c = snext();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = snext();
			} while (!isSpaceChar(c));
			return res.toString();
		}
 
		public boolean isSpaceChar(int c) {
			if (filter != null)
				return filter.isSpaceChar(c);
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}
 
		public interface SpaceCharFilter {
			public boolean isSpaceChar(int ch);
		}
	}
}
