#include<iostream>
#define MAX 50
using namespace std;

int main()
{
  int roll[MAX] ;
  float mark[MAX];
  string name[MAX];
  int n,i,j;

  cout<<"Enter the number of students : ";
  cin>>n;

  for(i=0;i<n;i++)
  {
    cout<<"======================\n";
    cout<<"Enter your name, roll and SGPA : ";
    cin>>name[i]>>roll[i]>>mark[i];
  }
  
  int ch;
  cout<<"1.Bubble sort(roll wise)\n2.Search(by linear search)\n\nEnter your choice : ";
  cin>>ch;
  
  if(ch==1)
    {
    for(i=0;i<n;i++)
    {
      for(j=0;j<n-i-1;j++)
      {
        if(roll[j]>roll[j+1])
        {
          string temp=name[j];
          name[j]=name[j+1];
          name[j+1]=temp;
          int temp1 =roll[j];
          roll[j]=roll[j+1];
          roll[j+1]=temp1;
          float temp2=mark[j];
          mark[j]=mark[j+1];
          mark[j+1]=temp2;   
        }
      }
    }
    cout<<"\n\nAfter roll wise sort   ( BUBBLE SORT ) : \n\n";
    for(j=0;j<n;j++)
    {
      cout<<"\n======================";
      cout<<"\nName : "<<name[j]<<"\nRoll no. :"<<roll[j]<<"\nMarks : "<<mark[j];
    }
  }
  
  if(ch==2)
  {
    float target;
    cout<<"Enter the SGPA to search : ";
    cin>>target;
    cout<<"======================\n";
    for(i=0;i<n;i++)
    {
      if(mark[i]==target)
      {
        cout<<"Name : "<<name[i]<<"\nSGPA : "<<mark[i]<<"\nRoll : "<<roll[i];
      }
    }
  }
}
