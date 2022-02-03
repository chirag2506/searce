// Given a distance ‘dist’, count total number of ways to cover the distance with 1, 2 and 3 steps. 
#include<iostream>
using namespace std;
 
int countWays(int dist){
    int count[dist+1];
    count[0] = 1;
    if(dist >= 1){
        count[1] = 1;
    }
    if(dist >= 2){
        count[2] = 2;
    }
 
    for (int i=3; i<=dist; i++){
       count[i] = count[i-1] + count[i-2] + count[i-3];
    }
 
    return count[dist];
}
 
int main()
{
    int dist; cin>>dist;
    cout << countWays(dist);
    return 0;
}