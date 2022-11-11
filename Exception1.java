import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Test{
	public static void main(String[] args) throws Exception{
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader b=new BufferedReader(r);
		String name= b.readLine();
		System.out.println(name);

	}
}