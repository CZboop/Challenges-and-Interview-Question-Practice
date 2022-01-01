from fractions import Fraction
def mixed_fraction(s):
    neg = True if s.count("-")==1 else False
    one = s.split("/")[0].strip("-")
    two = s.split("/")[1].strip("-")
    num_ = int(one)//int(two)
    x = Fraction(int(one)%int(two),int(two))
    y = "{} {}".format(num_ if num_!=0 else "",x if x!=0 else "").strip()
    if num_==0 and x==0:
        y="0"
    return y if neg==False or y=="0" else "-"+y