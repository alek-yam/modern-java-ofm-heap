import java.util.Random;


public class MemConsumer {
	private static long nextNum = 0;
	private static String nextStr = "";

	private String id;

	private MemConsumer next;

	private long num0;
	private long num1;
	private long num2;
	private long num3;
	private long num4;
	private long num5;
	private long num6;
	private long num7;
	private long num8;
	private long num9;
	
	private double dbl0;
	private double dbl1;
	private double dbl2;
	private double dbl3;
	private double dbl4;
	private double dbl5;
	private double dbl6;
	private double dbl7;
	private double dbl8;
	private double dbl9;
	
	private static String getNewId() {
		try {
			nextNum = Math.addExact(nextNum, 1);
		} catch (ArithmeticException e) {
			nextNum = 0;
			nextStr += "x";
		}
		
		return Long.toString(nextNum) + nextStr;
	}

	public MemConsumer() {
		id = getNewId();
		
		Random rn = new Random();
		
		num0 = rn.nextLong();
		num1 = rn.nextLong();
		num2 = rn.nextLong();
		num3 = rn.nextLong();
		num4 = rn.nextLong();
		num5 = rn.nextLong();
		num6 = rn.nextLong();
		num7 = rn.nextLong();
		num8 = rn.nextLong();
		num9 = rn.nextLong();
		
		dbl0 = rn.nextDouble();
		dbl1 = rn.nextDouble();
		dbl2 = rn.nextDouble();
		dbl3 = rn.nextDouble();
		dbl4 = rn.nextDouble();
		dbl5 = rn.nextDouble();
		dbl6 = rn.nextDouble();
		dbl7 = rn.nextDouble();
		dbl8 = rn.nextDouble();
		dbl9 = rn.nextDouble();
	}
	
	public String getId() {
		return id;
	}

	public MemConsumer getNext() {
		return next;
	}
	
	public void setNext(MemConsumer next) {
		this.next = next;
	}
	
	public String toString() {
		return "MemConsumer [id=" + id + ", next=" + next + ", num0=" + num0
				+ ", num1=" + num1 + ", num2=" + num2 + ", num3=" + num3
				+ ", num4=" + num4 + ", num5=" + num5 + ", num6=" + num6
				+ ", num7=" + num7 + ", num8=" + num8 + ", num9=" + num9
				+ ", dbl0=" + dbl0 + ", dbl1=" + dbl1 + ", dbl2=" + dbl2
				+ ", dbl3=" + dbl3 + ", dbl4=" + dbl4 + ", dbl5=" + dbl5
				+ ", dbl6=" + dbl6 + ", dbl7=" + dbl7 + ", dbl8=" + dbl8
				+ ", dbl9=" + dbl9 + "]";
	}
}
