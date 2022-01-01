def song_decoder(song):
    wubless = song.replace("WUB", " ")
    wubless = wubless.strip(" ")
    wubless = " ".join(wubless.split())
    return wubless