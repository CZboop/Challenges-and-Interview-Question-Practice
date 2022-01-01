def isAnagram(test, original):
    test_s = [i.lower() for i in test.replace(" ","") if i.isalnum()==True]
    og_s = [i.lower() for i in original.replace(" ","") if i.isalnum()==True]
    return sorted(test_s)==sorted(og_s)