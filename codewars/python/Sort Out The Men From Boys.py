def men_from_boys(arr):
    e=[i for i in arr if i%2==0]
    o=[i for i in arr if i%2!=0]
    return sorted(set(e),reverse=False)+sorted(set(o),reverse=True)