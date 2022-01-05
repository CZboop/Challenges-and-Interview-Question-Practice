from collections import Counter

def solution(encryptedText):
    return Counter(i for i in encryptedText).most_common()[0][0]
