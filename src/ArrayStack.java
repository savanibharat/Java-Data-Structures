
public class ArrayStack 
{
	boolean [] freeIndex;
	int [] stackPointers =  {-1, -1, -1}; //array for holding pointers to individual stacks
	int stackSize;
	StackNode [] buffer;

	public ArrayStack(int sz)
	{
		stackSize = 3*sz;
		buffer = new StackNode[stackSize];
		freeIndex = new boolean[stackSize];
		for(int i=0; i<stackSize; i++)
			freeIndex[i] = true;// all elements are free for alloc
	}
	
	private int getNextFreeIndex()
	{
		for(int i =0; i< stackSize; i++)
		{
			if(freeIndex[i])
				return i;
		}
		System.out.println("Stack Array is FULL");
		return -1;
	}

	public void push(int stackNum, int data)
	{
		int index = getNextFreeIndex();
		if(index < 0)
		{
			System.out.println("Push failed....");
			return;
		}
		
		int lastIndex = stackPointers[stackNum];
		stackPointers[stackNum] = index;//new index
		freeIndex[index] = false;
		buffer[index] = new StackNode(stackNum, lastIndex, data);
		
	}//push ends

	public int pop(int stackNum)
	{
		if(stackPointers[stackNum] >= 0)
		{
			int item = buffer[stackPointers[stackNum]].data;
			int lastIndex = stackPointers[stackNum];
			stackPointers[stackNum] = buffer[stackPointers[stackNum]].prevIndex;
			buffer[lastIndex]= null;
			freeIndex[lastIndex]= true;	
			return item;
		}
		System.out.println("Stack is Empty");
		return 0;
	}
	
	public String toString()
	{
		String rtStr = "";
		
		for(int i=0; i<stackSize; i++)
		{
			rtStr += " Index:: "+i + "Node Element:: "+buffer[i];
		}
		
		return rtStr;
	}

	
	public static void main(String [] argc)
	{
		System.out.println("**** Array Stack ***");
		ArrayStack arr1 = new ArrayStack(2);
		System.out.println("Push 3 elements in each stack");
		arr1.push(0, 5);
		arr1.push(1, 15);
		arr1.push(2, 25);
		//System.out.println("array stack view "+ arr1);
		System.out.println("Removing stack 1 element...");
		arr1.push(2, 25);
		arr1.push(2, 25);
		arr1.push(2, 25);
		System.out.println("Here stack is full....");
		System.out.println("Now remove one elemenet and try again...");
		arr1.pop(1);
		arr1.push(0, 25);
		System.out.println("array stack view "+ arr1);
	}

}
