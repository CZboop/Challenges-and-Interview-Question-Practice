def create_phone_number(n):
    new="".join(map(str,n))
    return "({}) {}-{}".format(new[:3],new[3:6],new[6:])