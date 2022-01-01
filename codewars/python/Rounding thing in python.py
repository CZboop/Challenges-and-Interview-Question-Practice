def typing_test(seconds,sentence):
    return "{} WPM".format((round(len(sentence.split(" "))*(60/seconds)+0.001)))