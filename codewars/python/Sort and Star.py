def two_sort(array):
    x= min(sorted(array))
    return "".join([i+"***" for i in x]).rstrip("*")