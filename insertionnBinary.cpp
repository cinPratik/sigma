#include <iostream>
using namespace std;
#include<string.h>
int const size=3;
struct student{
 int rno;
 char name[20];
 float SGPA;
};
void accept(struct student list[size]);
void display(struct student list [80]);
void insertSort(struct student list[size]);
void binarysearch(struct student list[size]);
main()
{
 int ch, i;
 struct student data[20];
 accept (data);
 
 cout<<"\n 1:Insertion Sort";
 cout<<"\n 2:Binary Search";
 cout<<"\n 3:Select your choice:";
 cin>>ch;
 switch(ch)
 {
 case 1:
 insertSort(data);
 display(data);
 break;

 case 2:
 binarysearch(data);
 break;

 default:
 cout<<"Invalid choice....";
 }
}
void accept(struct student list[size])
{
 int i;
 for (i=0;i<size;i++)
 {
 cout<<"Enter rollno,name & SGPA:";
 cin>>list[i].rno>>list[i].name>>list[i].SGPA;
 }
}
void display(struct student list[80])
{
 int i;
 cout<<"\n Roll no \t Name \t SGPA \n";
 for(i=0;i<size;i++)
 {
 cout<<"\n"<<list[i].rno<<"\t"<<list[i].name<<"\t"<<list[i].SGPA;
 }
}

void insertSort(struct student list[size])
{
 int k,j;
 struct student temp;
 for(k=1;k<size;k++)
 {
 temp=list[k];
 j=k-1;
 while(strcmp(list[j].name,temp.name)>0&&j>=0)
 {
 list[j+1]=list[j];
 --j;
 }
 list[j+1]=temp;
 }
}

void binarysearch(struct student list[size])
{
 int k, lower, upper, mid;
 char search[80];
 cout<<"\n Enter name of the students you want to search";
 cin>>search;
 lower=0;
 upper=size-1;
 mid=(lower+upper)/2;
 while(lower<=upper)
 {
 if(strcmp(list[mid].name,search)<0)
 lower=mid+1;
 else if(strcmp(list[mid].name,search)==0)
 {
 cout<<"\n"<<list[mid].rno<<"\t"<<list[mid].name<<"\t"<<list[mid].SGPA;
 break;
 }
 else
 upper=mid-1;
 mid=(lower+upper)/2;
 }
 if(lower>upper)
 cout<<search<<"not found in the list";
}
