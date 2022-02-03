#include <iostream>
using namespace std;

int main()
{
    int t; cin>>t;
    while(t--){
        int n; cin>>n;
        int one=0, two=0;

        while(n--){
            int candy_weight; cin>>candy_weight;
            if(candy_weight==1){
                one++;
            }else{
                two++;
            }
        }

        if ((one + 2 * two) % 2 != 0) {
            cout << "NO\n";
        } else {
            int sum = (one + 2 * two) / 2;
            if (sum % 2 == 0 || (sum % 2 == 1 && one != 0)) {
                cout << "YES\n";
            } else {
                cout << "NO\n";
            }
        }
    }
    return 0;
}