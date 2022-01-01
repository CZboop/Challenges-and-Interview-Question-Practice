def fibonacci(n):
    if n in [0, None] or n <0:
        return []
    else:
        new = []
        for i in range(n):
            if len(new)<2:
                new.append(i)
            else:
                new.append(sum(new[-2:]))
        return new