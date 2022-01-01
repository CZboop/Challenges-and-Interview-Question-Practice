function alienLanguage(str){
    var str = str.toUpperCase();
    str = str.split(" ");
    for (i in str){
      str[i] = str[i].slice(0,-1) + str[i][str[i].length-1].toLowerCase();
    }
    return str.join(" ");
  }