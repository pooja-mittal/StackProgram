package Stack;

public class MyStack {
	public static void main(String[] args) {
		Demo1 d=new Demo1();
		d.push(10);
		d.push(20);
		d.push(30);
		d.push(40);
		//System.out.println((Integer)(d.pop()));
		for(int i=0; i<d.size(); i++) {
			System.out.print((Integer)(d.pop())+ " ");
		}
	}

	

}
