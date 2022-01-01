def sort_vowels(s):
    new = ""
    try:
        for i in s:
            if i in "aeiouAEIOU":
                new+="|"+i+"\n"
            else:
                new+=i+"|"+"\n"
        return new.strip("\n")
    except:
        return ""