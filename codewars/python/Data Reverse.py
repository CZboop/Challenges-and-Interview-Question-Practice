def data_reverse(data):
    data = "".join(str(i) for i in data)
    x = [data[i:i+8] for i in range(0,len(data),8)]
    y = x[::-1]
    y="".join(y)
    return [int(i) for i in y]