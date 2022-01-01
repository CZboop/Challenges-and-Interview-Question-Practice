def zeros(n):
    result = 1
    results = []
    five = 5
    while result>=1:
        result = n//five
        five*=5
        results.append(result)
    return sum(results)