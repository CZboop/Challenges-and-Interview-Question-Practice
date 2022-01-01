d={"zero": 0,"one":1,"two":2,"three":3,"four":4,"five":5,"six":6,"seven":7,"eight":8,"nine":9}
def average_string(s):
    try:
        x = [d.get(i) for i in s.split(" ")]
        return list(d.keys())[list(d.values()).index(sum(x)//len(x))]
    except:
        return "n/a"