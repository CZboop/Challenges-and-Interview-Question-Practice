import re

def solution(text):
    text = re.sub('[^a-zA-Z]+', ' ', text)
    text = text.split(" ")
    return max(text , key=len)

