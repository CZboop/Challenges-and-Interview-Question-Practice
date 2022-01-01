def find_even_index(arr):
    for counter, value in enumerate(arr):
        if sum(arr[:counter]) == sum(arr[counter+1:]):
            result =  counter
            return result
        else:
            result = -1
    return result