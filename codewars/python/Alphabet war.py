def alphabet_war(fight):
    d = {"w":4,"p":3,"b":2,"s":1,"m":4,"q":3,"d":2,"z":1}
    left = 0
    right = 0
    for i in fight:
        if i in "wpbs":
            left+= d.get(i,0)
        if i in "mqdz":
            right+= d.get(i,0)
    return "Left side wins!" if left>right else "Right side wins!" if right>left else "Let's fight again!"