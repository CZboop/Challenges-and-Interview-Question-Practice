def remove_smallest(numbers):
    new = numbers.copy()
    try: 
        new.remove(min(new))
        return new
    except:
        return []