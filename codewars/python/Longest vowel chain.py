def solve(s):
    x = []
    count = 0
    for i in s:
        if i in "aeiou":
            count+=1
        else:
            x.append(count)
            count = 0
    return max(x)