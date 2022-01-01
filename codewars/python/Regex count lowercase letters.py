import re
def lowercase_count(strng):
    return len(re.findall("[a-z]", strng))