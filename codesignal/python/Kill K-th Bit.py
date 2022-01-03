def solution(n, k):
    return int(("{:#010b}".format(n)[2:][::-1][:k-1]+"0"+"{:#010b}".format(n)[2:][::-1][k:])[::-1], 2)