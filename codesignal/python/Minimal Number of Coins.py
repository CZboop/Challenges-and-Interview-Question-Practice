def solution(coins, price):
    coin_num = 0
    for i in sorted(coins, reverse=True):
        coin_num += (price//i)
        price -= (price//i)*i
    return coin_num 
