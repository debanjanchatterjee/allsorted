
class HeapSort
{
	void swap(int arr[],int i,int j)
	{
		int t=arr[i];
		arr[i]=arr[j];
		arr[j]=t;
	}

	void heapSort(int arr[],int n)
	{
		buildMaxHeap(arr,n);
		for(int i=n-1;i>=0;i--)
		{
			swap(arr,i,0);
			maxHeapify(arr,0,i);
		}
	}

	void buildMaxHeap(int arr[],int n)
	{
		for(int i=(n/2)-1;i>=0;i--)
		{
			maxHeapify(arr,i,n);
		}
	}

	void maxHeapify(int arr[], int i, int n)
	{
		int max=i;
		int l=2*i+1;
		int r=2*i+2;
		if(l<n && arr[l]>arr[max])
			max=l;
		if(r<n && arr[r]>arr[max])
			max=r;
		if(i!=max)
		{
			swap(arr,i,max);
			maxHeapify(arr,max,n);
		}

	}
	 
	void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 


	public static void main(String args[])
	{
		HeapSort ob=new HeapSort();
		int arr[]={10,3,5,1,9,8};
		int n=arr.length;
		ob.heapSort(arr,n);
		System.out.println("Sortred Array :");
		ob.printArray(arr);
	}
}