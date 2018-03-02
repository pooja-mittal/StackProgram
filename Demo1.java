package Stack;

public class Demo1 {
	Object[] arr;
	int top;
	int stackSize;

	public Demo1() {
		top = -1;
		stackSize = 1;
		arr = new Object[stackSize];
	}

	void push(Object ele) {
		if (top >= stackSize - 1)
			resize();
		arr[++top] = ele;

	}

	private void resize() {
		Object[] temp = arr;
		stackSize = stackSize * 2;
		arr = new Object[stackSize * 2];
		for (int i = 0; i <= top; i++) {
			arr[i] = temp[i];
		}
	}

	Object pop() {
		if (top < 0)
			System.out.println("stack is underflow ");
		return arr[top--];
	}
	
	int size() {
		return stackSize; 
	}
}
