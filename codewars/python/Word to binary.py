def word_to_bin(word):
    return list(bin(ord(i)).replace("b","") for i in word)