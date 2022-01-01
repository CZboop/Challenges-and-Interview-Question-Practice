function countWords(str) {
    splitted = str.split(/\s+/).filter(i=>i.length>0);
    return splitted.length;
  }