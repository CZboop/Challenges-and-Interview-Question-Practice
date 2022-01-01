def correct_polish_letters(st): 
    d={"ą":"a","ć":"c","ę":"e","ł":"l","ń":"n","ó":"o","ś":"s","ź":"z","ż":"z"}
    new=""
    for i in st:
        if i.lower() in d.keys():
            new+=d.get(i)
        else:
            new+=i
    return new