def format_words(words):
    try:
        words = [i for i in words if i.isalpha()==True]
        if len(words)==1:
            return str(words[0])
        return ", ".join(words[:-1]) + " and " + words[-1]
    except:
        return ""