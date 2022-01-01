import re
def disemvowel(string):
    string = re.sub('[aeiouAEIOU]','', string)
    return string