def rotate(str_):
    new = []
    for i in range(len(str_)):
        str_ = str_[1:]+str_[0]
        new.append(str_)
    return new