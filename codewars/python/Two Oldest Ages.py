def two_oldest_ages(ages):
    new = []
    x = max(ages)
    new.append(x)
    ages.remove(x)
    new.append(max(ages))
    return sorted(new)