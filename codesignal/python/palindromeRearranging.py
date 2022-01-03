def solution(inputString):
    counts = [inputString.count(i) for i in set(inputString)]
    noteven = [i for i in counts if i%2!=0]
    return len(noteven)==0 or len(noteven)==1
