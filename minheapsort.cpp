#include <iostream>
using namespace std;
class Heap
{
int H[20];
public:
 Heap(){H[0]=0;}
 void insert(int);
 void Sort();
};
void Heap::insert(int Num)
{
int i,T;
i=++H[0];
H[i]=Num;
while(i/2>0)
 { if(H[i] > H[i/2])
 { T=H[i];H[i]=H[i/2];H[i/2]=T;}
 i=i/2;
 }
cout<<endl<<H[0]<<" :";
for(i=1;i<=H[0];i++) cout<<" "<<H[i];
}
void Heap::Sort()
{ cout<<"\nSort";
int i=H[0],j,k,T;
while(i>1)
 {
 T=H[1];H[1]=H[i];H[i]=T;
 i--;
 k=j=1;
 while(j<=k)
 { //cout<<"\nL"<<H[j*2]<<" R"<<H[j*2+1];
 if((j*2+1)<=i)
 { if(H[j*2]>H[j*2+1]) k=j*2;//cout<<"if";}
 else k=j*2+1;}//cout<<"else";}}
 else if((j*2)<=i) k=j*2 ;//cout<<"else2";}
 //cout<<"\nj:"<<j;
 if(j!=k && H[j]<H[k])
 { T=H[k];H[k]=H[j];H[j]=T;
 j=k; }
 else break;
 cout<<endl<<H[0]<<" :";
 for(int l=1;l<=i;l++) cout<<" "<<H[l];
 }
 }
cout<<"\nSorted Data\n";
cout<<endl<<H[0]<<" :";
for(i=1;i<=H[0];i++) cout<<" "<<H[i];
}
int main()
{
Heap Hp;
int no,Num;
cout<<"\n How many numbers you want to insert";
cin>>no;
for(int i=0;i<no;i++)
 {
 cout<<"\nEnter Number:";
 cin>>Num;
 Hp.insert(Num);
 }
Hp.Sort();
return 1;
}
