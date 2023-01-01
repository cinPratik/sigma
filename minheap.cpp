#include<iostream>
using namespace std;

void heapify(int arr[],int n,int i)
{
	int largest=i;
	int left=i*2+1;
	int right=i*2+2;
	
	if(left<n && arr[left]>arr[largest])
		largest=left;
		
	if(right<n && arr[right]>arr[largest])
		largest=right;
		
	if(largest!=i)
    {
		swap(arr[largest],arr[i]);
		heapify(arr,n,largest);
	}
}

void heapSort(int arr[],int n)
{
	for(int i=n/2-1;i>=0;i--)
	{
		heapify(arr,n,i);
	}
	
	for(int i=n-1;i>=0;i--)
	{
		swap(arr[0],arr[i]);
		heapify(arr,i,0);
	}
}

void dispArray(int arr[],int n)
{
	for(int i=0;i<n;i++)
		cout << arr[i] << " "; 
		
	cout<<"\n";
}

int main()
{
	int n;
	cout<<"Enter no. elements to be in array : ";
	cin>>n;
    int arr[n];
	cout<<"Enter elements of array : ";
	for(int i=0;i<n;i++)
	{
		cin>>arr[i];
	}
	
	cout<<"Array before sorting \n";
	dispArray(arr,n);

	heapSort(arr,n);

	cout<<"Array after sorting \n";
	dispArray(arr,n);	
}