def tribonacci(signature, n):
    if n==0:
        return []
    elif n<=3:
        return signature[:n]
    else:
        x = signature
        for i in range(2,n-1):
            y = x[i-2] + x[i-1] + x[i]
            x.append(y)
        return x