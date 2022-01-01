def is_valid_IP(strng):
    try: 
        z = True
        for i in strng.split("."):
            if i[0]=="0":
                if i[-1]!="0":
                    z= False
        return strng.count(".")==3 and all(0<=int(i)<=255 for i in strng.split(".")) and " " not in strng and z
    except:
        return False