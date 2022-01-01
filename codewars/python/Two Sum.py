def two_sum(numbers, target):
    for i in numbers:
        for j in numbers:
            if i+j==target:
                if i!=j:
                    return [numbers.index(i), numbers.index(j)]
                else:
                    return [k for k,x in enumerate(numbers) if x==i]