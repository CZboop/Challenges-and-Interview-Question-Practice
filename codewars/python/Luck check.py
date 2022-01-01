def luck_check(s):
    print(s)
    try:
        if len(s)%2==0:
            return sum(int(i) for i in s[:int(len(s)/2)])==sum(int(i) for i in s[int(len(s)/2):]) and all(i.isalpha()==False for i in s)
        else:
            return sum(int(i) for i in s[:int((len(s)-1)/2)])==sum(int(i) for i in s[int((len(s)+1)/2):]) and all(i.isalpha()==False for i in s)
    except:
        return Error