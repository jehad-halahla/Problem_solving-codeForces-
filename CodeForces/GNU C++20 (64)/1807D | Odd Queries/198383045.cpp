/**
 * AUTHOR: UseHashMap
 *
 */
 
#include <bits/stdc++.h>
 
using namespace std;
 
typedef long long ll;
typedef string String;
 
#define ISHOWSPEED ios_base::sync_with_stdio(false); cin.tie(0); cout.tie(0);
#define mp make_pair
#define pb push_back
#define inF freopen("input.in", "r", stdin);
#define outF freopen("output.in", "w", stdout);
#define endl '\n'
#define el endl
#define EL el
#define COUT cout
#define MOD 1000000007
#define mm(arr) memset(arr, 0, sizeof(arr))
#define F first
#define S second
#define null NULL
#define umap unordered_map
#define uset unordered_set
 
#define prioq priority_queue
#define heap priority_queue
#define min_heap     priority_queue <int, vector<int>, greater<int> >
#define zerof __builtin_clz
#define  zerol __builtin_ctzl
#define onecnt __builtin_popcount
#define parity __builtin_parity // even or odd parity (number of 1 bits) 0 if even else 1
#define toUPPER(s) transform(s.begin(), s.end(), s.begin(), ::toupper);
#define toLOWER(s) transform(s.begin(), s.end(), s.begin(), ::tolower);
#define  contains(z, s) (z.find(s) != std::string::npos)
#define __sum(n) n * (n + 1) / 2
 
const long double PI = atan(1) * 4.0;
const int N = 2e5 + 1;
 
 
#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
 
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    cout.tie(0);
 
    ll t;
    cin >> t;
    while (t--) {
        ll n, q;
        cin >> n >> q;
        vector<ll> v(n);
        for (int i = 0; i < n; ++i) {
            cin >> v[i];
        }
 
        vector<ll> prefix_sum(n+1);
        prefix_sum[0] = 0;
        for (int i = 0; i < n; i++) {
            prefix_sum[i+1] = prefix_sum[i] + v[i];
        }
      
 
        while (q--) {
            ll l, r, k;
            cin >> l >> r >> k;
 
            ll sum = prefix_sum[n] - prefix_sum[r] + prefix_sum[l-1];
            ll len = r - l + 1;
             
            if ((sum + len * k) % 2 == 0) {
                cout << "NO\n";
            } else {
                cout << "YES\n";
            }
 
        }
    }
 
    return 0;
}