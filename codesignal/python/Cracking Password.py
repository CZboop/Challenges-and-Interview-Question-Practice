from itertools import product

def solution(digits, k, d):
    def createNumber(digs):
        return "".join(map(str, digs))

    return sorted([ createNumber(i) for i in product(digits, repeat=k) if int(createNumber(i)) % d == 0 ])
