def solution(symbol):
    if symbol.isdigit():
        return "odd" if int(symbol)%2!=0 else "even"
    return "not a digit"
