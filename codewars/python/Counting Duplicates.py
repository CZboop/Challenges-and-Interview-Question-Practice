def duplicate_count(text):
    counter = []
    text = [i.lower() for i in text]
    for i in text:
        if text.count(i)>1:
            counter.append(i)
    return len(set(counter))