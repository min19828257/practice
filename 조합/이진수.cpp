#include<iostream>
#include<vector>
#include<stack>
#include<algorithm>
#include<vector>

#define MAXN 100

using namespace std;

void print_arr(int set[], int set_size) {
    for (int i = 0; i < set_size; i++)
    {
        cout << set[i] << " ";
    }
    cout << endl;
}

void comb(int bits[], int n, int k, int index) {
    
    int i;

    if (k == 0) {
        for (i = index; i < n; i++)
            bits[i] = 0;
        print_arr(bits, n);
    }
    else if (index == n) {
        return;
    }
    else {
        bits[index] = 0;
        comb(bits, n, k, index + 1);
        bits[index] = 1;
        comb(bits, n, k - 1, index + 1);
    }
}

int main() {
    
    int set[MAXN], n, k;

    printf("input n, k: ");
    scanf_s("%d %d", &n, &k);
    comb(set, n, k, 0);
    return 1;
}
