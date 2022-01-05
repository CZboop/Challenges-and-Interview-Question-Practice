def solution(word1, word2):
    def getIdentifier(w1, w2):
        return "".join(sorted(set([i for i in w1 if i not in w2])))

    return [getIdentifier(word1, word2), getIdentifier(word2, word1)]
