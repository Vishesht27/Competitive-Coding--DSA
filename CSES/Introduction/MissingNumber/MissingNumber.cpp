signed main()
{
    ios_base::sync_with_stdio(false); cin.tie(NULL);
    int n; cin >> n;
    int sm = 0;
    for (int i = 0; i < n-1; ++i) { int x; cin >> x; sm += x; }
    cout << ((n*(n+1))/2 - sm) << '\n';
    return 0;
}
