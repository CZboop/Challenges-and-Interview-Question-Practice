def count_vowels(string):            
    return sum(i.count(j) for j in "aeiou" for i in string.lower().split(" "))