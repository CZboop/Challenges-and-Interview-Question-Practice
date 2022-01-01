def my_languages(results):
    x = [i for i in results.keys() if results.get(i)>=60]
    return sorted(x, key=results.get, reverse=True)