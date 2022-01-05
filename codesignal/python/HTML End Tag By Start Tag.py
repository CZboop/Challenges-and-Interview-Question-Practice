def solution(startTag):
    tag = startTag.split("<")[1].split(" ")[0].split(">")[0]
    return "</{}>".format(tag)
