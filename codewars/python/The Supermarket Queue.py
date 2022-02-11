def queue_time(customers, n):
    tills = []
    for i in customers:
        if len(tills) < n:
            tills.append(i)
        else:
            tills[tills.index(min(tills))] += i
            
    return max(tills) if len(tills) > 0 else 0