def iq_test(numbers):
    numbers = numbers.split(" ")
    odd = [int(i) for i in numbers if int(i)%2!=0]
    even = [int(i) for i in numbers if int(i)%2==0]
    if len(odd)>len(even):
        return numbers.index(str(even[0]))+1
    else:
        return numbers.index(str(odd[0]))+1