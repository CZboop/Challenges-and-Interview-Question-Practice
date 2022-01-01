def fit_in(a,b,m,n):
    return max(a,b) <= n and max(a,b) <= m and a+b <= max(m,n)