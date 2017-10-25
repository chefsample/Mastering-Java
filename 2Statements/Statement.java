public class Statement {
	public static void main(String[] args){
		int x =3;
		String name = "Kumar";
		x = x * 17;
		System.out.print("x is " +x);
		double d = Math.random();
		while (x > 12){
			x = x -1;
		}
		for(; x < 10; x = x +1){
			System.out.print("x is now " +x);
		}
		System.out.print("x:"+x+"d:" +d);
	}
}
