def switcheroo(string):
    translation = string.maketrans("ab","ba")
    return string.translate(translation)