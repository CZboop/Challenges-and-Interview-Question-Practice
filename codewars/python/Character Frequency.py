def char_freq(message):
    d={}
    for i in message:
        d[i]=message.count(i)
    return d