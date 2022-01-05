def solution(a, b, n):
    money = 0
    for i in range(n):
        money += a * b
        a, b = a + 1, b + 1
    return money 
