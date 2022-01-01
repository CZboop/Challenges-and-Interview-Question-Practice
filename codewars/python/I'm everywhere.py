def i(word):
    try:
        vow = sum(word.lower().count(i) for i in "aeiou")
        cons = len(word)-vow
        
        if word[0].lower()!="i" and word[0].upper()==word[0] and vow<cons:
            return "i{}".format(word)
        else:
            return "Invalid word"
    except:
        return "Invalid word"