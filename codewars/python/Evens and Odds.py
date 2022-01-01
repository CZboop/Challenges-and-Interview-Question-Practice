def evens_and_odds(n):
    return bin(n).replace("0b","") if n%2==0 else hex(n).replace("0x","")