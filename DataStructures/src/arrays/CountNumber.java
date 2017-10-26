package demo;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.InputMismatchException;

public class CountNumber {

	public static void main(String[] args) throws IOException {
        Scan sc = new Scan();
        
//      Scanner sc=new Scanner(System.in).useDelimiter("\\s");

        String str = sc.scanLine();
        String[] splitStr = str.trim().split("\\s+");
       
        int N = Integer.parseInt(splitStr[0]);
        int D = Integer.parseInt(splitStr[1]);
     
      String secInput = sc.scanLine();
      String[] splitStr2 = secInput.trim().split("\\s+");

      int A=Integer.parseInt(splitStr2[0]);
      int B=Integer.parseInt(splitStr2[1]);

     
      String thirdInput = sc.scanLine();
      String[] splitStr3 = thirdInput.trim().split("\\s+");
     
      int[] array = Arrays.stream(splitStr3).mapToInt(Integer::parseInt).toArray();
      int[] diff= new int[N];
      for(int a= 0;a<N;a++){
         diff[a]= Math.abs(array[a]-D);
      }
                
      int counter=0;
     
      int r=0;
      
      while(B != 0)
      {
          r = A % B;
          A = B;
          B = r;
      }
//      System.out.print("GCD = "+A);
      
      int gcd = A;
     

      for(int i=0;i<N;i++){

    	 if(diff[i]%gcd==0){
    		 counter++;
    	 }
      }
     
      Print print=new Print();
      print.println(counter);
      print.close();
  }

}


class Print {
	private final BufferedWriter bw;

	public Print() {
		this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
	}

	public void print(Object object) throws IOException {
		bw.append("" + object);
	}

	public void println(Object object) throws IOException {
		print(object);
		bw.append("\n");
	}

	public void close() throws IOException {
		bw.close();
	}
}

class Scan {
	private byte[] buf = new byte[1024]; // Buffer of Bytes
	private int index;
	private InputStream in;
	private int total;

	public Scan() {
		in = System.in;
	}

	public int scan() throws IOException // Scan method used to scan buf
	{
		if (total < 0)
			throw new InputMismatchException();
		if (index >= total) {
			index = 0;
			total = in.read(buf);
			if (total <= 0)
				return -1;
		}
		return buf[index++];
	}

	public int scanInt() throws IOException {
		int integer = 0;
		int n = scan();
		while (isWhiteSpace(n)) // Removing starting whitespaces
			n = scan();
		int neg = 1;
		if (n == '-') // If Negative Sign encounters
		{
			neg = -1;
			n = scan();
		}
		while (!isWhiteSpace(n)) {
			if (n >= '0' && n <= '9') {
				integer *= 10;
				integer += n - '0';
				n = scan();
			} else
				throw new InputMismatchException();
		}
		return neg * integer;
	}

	public String scanLine() throws IOException {
		StringBuilder sb = new StringBuilder();
		int n = scan();
		while (isWhiteSpace(n))
			n = scan();
		while (!isWhiteSpace(n)) {
			sb.append((char) n);
			n = scan();
		}
		return sb.toString();
	}

	private boolean isWhiteSpace(int n) {
		if (/* n==' '|| */n == '\n' || n == '\r' || n == '\t' || n == -1)
			return true;
		return false;
	}
}
