def to_camel_case(text):
    if len(text)==0:
        return text
    up = False
    if len(text)>0 and text[0].isupper()==True:
        up = True
    text = text.replace("_","-").split("-")
    if up==True:
        return "".join([i.capitalize() for i in text])
    else:
        return text[0]+"".join([i.capitalize() for i in text[1:]])