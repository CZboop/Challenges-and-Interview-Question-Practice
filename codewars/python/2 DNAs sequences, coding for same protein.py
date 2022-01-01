def code_for_same_protein(seq1,seq2):
    x = [seq1[i:i+3] for i in range(0,len(seq1), 3)]
    y = [seq2[i:i+3] for i in range(0,len(seq2), 3)]
    one = [codons.get(i) for i in x]
    two = [codons.get(i) for i in y]
    return one==two