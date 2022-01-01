def consecutive(arr):
    return (max(arr)-min(arr))-len(arr)+1 if arr else 0