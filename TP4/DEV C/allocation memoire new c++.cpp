#include <iostream>
using namespace std;

int main()
{
int * p1 = new int; 
*p1 = 1; 
cout <<"avant liberation de memoire "<< *p1 << endl; 
delete p1; 
cout <<"apres liberation de memoire "<< *p1 << endl;
return 0;
}
