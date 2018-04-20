import java.util.StringTokenizer;

public class StringTokenTest {
	public static void main(String[] args) {
		String str = "sudheer,345,kumar,35355,akula";
		StringTokenizer st = new StringTokenizer(str,",");
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
	}

}
