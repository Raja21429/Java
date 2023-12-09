package Heap;

public class HeapLogic {
	
	int[] heap;
	int maxSize;
	int size;
	
	public HeapLogic(int maxSize) {
		this.maxSize=maxSize;
		this.heap=new int[maxSize];
		heap[0] = 6574;
		this.size=0;
	}
	public int parentPos(int pos) {
		return pos/2;
	}
	
	public int leftChild(int pos) {
		return pos*2;
	}
	public int rightChild(int pos) {
		return pos*2+1;
	}
	
	public void swap(int pos1,int pos2) {
		int temp = heap[pos1];
		heap[pos1] = heap[pos2];
		heap[pos2] = temp;
	}
	
	public void mixHeap(int pos) {
		while(pos > 0 && parentPos(pos) > 0 && heap[parentPos(pos)] < heap[pos]) {
			swap(pos,parentPos(pos));
			pos =parentPos(pos);
		}
	}
		
		public void minHeapSol2(int parentPos,int pos2) {
			if(parentPos !=0 && pos2 !=0 && heap[pos2] > heap[pos2]) {
				swap(parentPos,pos2);
				minHeapSol2(parentPos,parentPos(parentPos));
			
		}
	}
	public void insert( int val) {
		heap[++size] = val;
		int currentSize = size;
		minHeapSol2(parentPos(currentSize), currentSize
				);
	}
	public void display() {
		for(int i=1;i<heap.length/2+1;i++) {
			System.out.println(heap[i]);
			
			if(maxSize >= leftChild(i)) {
				System.out.println(heap[leftChild(i)]);
			}
			if(maxSize >= rightChild(i)) {
				System.out.println(heap[rightChild(i)]);
			}
			
		}
	}
	}
