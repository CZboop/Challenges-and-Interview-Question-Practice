def geometric_sequence_sum(a, r, n):
    sum_ = a
    for i in range(n-1):
        a*=r
        sum_+=a
    return sum_