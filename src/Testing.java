import java.util.Random;

public class Testing {
	
	public static void main(String[] args) {
		
		System.out.println("Test");
		Testing t = new Testing();
		int[] arr = t.generateArray(10);
		for(int a : arr) {
			System.out.println(a);
		}
		arr = t.selectionSort(arr);
		System.out.println("After");
		for(int i : arr) {
			System.out.println(i);
		}
	}
	
	public int[] generateArray(int n) {
		
		Random rnd = new Random();
		int[] arr = new int[n];
		int[] arr2 = new int[] {4866,4921,7282,1380,7278,
			6885,985,5427,5989,712};
		/*for(int i=0;i<n;i++) {
			
			arr[i] = rnd.nextInt(7777);
			//System.out.println(arr[i]);
			
		}*/
		return arr2;
	}
	
	public int[] bubbleSort(int[] array) {
		
		int count = 0;
		int size = array.length;
		int tmp = 0;
		for(int i=0;i<size-1;i++) {
			
			for(int j=0;j<size-i-1;j++) {
				if(array[j]>array[j+1]) {
					//swap
					tmp = array[j];
					array[j] = array[j+1];
					array[j+1] = tmp;
					count++;
				}
			}
			
		}
		System.out.println("Swaps-"+count);
		
		return array;
	}
	
	public int[] insertionSort(int[] arr) {
		
		int count = 0;
		int size = arr.length;
		for(int i=1;i<size;i++) {
			
			int key = arr[i];
			int j = i-1;
			
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j--;
				
			}
			arr[j+1] = key;
			
		}
		return arr;
	}
	
	public int[] selectionSort(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			
			int min = arr[i];
			int minIndex = i;
			
			for(int j=i;j<arr.length;j++) {
				if(arr[j]<min) {
					min = arr[j];
					minIndex = j;
				}
			}
			arr[minIndex] = arr[i];
			arr[i] = min;			
			
		}
		
		return arr;
	}

}
