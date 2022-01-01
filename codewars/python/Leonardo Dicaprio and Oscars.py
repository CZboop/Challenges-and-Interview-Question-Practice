def leo(oscar):
    d= {88:"Leo finally won the oscar! Leo is happy",86:"Not even for Wolf of wallstreet?!"}
    if oscar>88:
        return "Leo got one already!"
    else:
        return d.get(oscar,"When will you give Leo an Oscar?")