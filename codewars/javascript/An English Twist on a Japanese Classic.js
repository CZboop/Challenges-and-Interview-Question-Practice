function shiritori(words) {
    const valids = [words[0]];
    for (let i = 0; i < words.length -1; i++){
      if (words[i].slice(words[i].length-1) != words[i+1].slice(0,1) || words[i] == ""){
        return valids.filter(x=>x);
      }
      valids.push(words[i+1]);
    }  
    return valids.filter(x=>x);
  }