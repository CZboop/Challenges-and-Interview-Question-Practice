def generate_hashtag(s):
    if len(s)>140 or len(s)==0:
        return False
    else:
        x = s.split(" ")
        y = []
        for i in x:
            y.append(i.capitalize())
        return "#"+ "".join(y).replace(" ","")