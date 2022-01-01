def likes(names):
    l= len(names)
    if l==0:
        return "no one likes this"
    elif l== 1:
        return names[0]+ " likes this"
    elif l==2:
        return names[0]+ " and "+names[1]+ " like this"
    elif l==3:
        return names[0]+ ", "+ names[1]+ " and "+names[2]+ " like this"
    elif l>3:
        return names[0]+", "+names[1]+" and "+str(l-2)+ " others like this"