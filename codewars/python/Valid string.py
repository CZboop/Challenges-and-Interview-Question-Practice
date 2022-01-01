def valid_word(seq, word): 
    word1 = word
    true_count = 0
    for i in seq:
        if i in word1:
            word1 = word1.replace(i,"")
    if word1:
        pass
    else:
        true_count+=1
    for i in seq[::-1]:
        if i in word:
            word = word.replace(i,"")
    if word:
        pass
    else:
        true_count+=1
    return true_count>0