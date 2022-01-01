def solution(number):
    a = 0
    b = 0
    c = 0
    for i in range(1,number):
        if i%3==0 and i%5!=0:
            a+=1
        if i%5==0 and i%3!=0:
            b+=1
        if i%3==0 and i%5==0:
            c+=1
    return [a,b,c]