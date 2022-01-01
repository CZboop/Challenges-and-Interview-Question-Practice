function splitAndMerge(string, separator) {
    var x = string.split(" ");
    for (i in x){
      x[i] = x[i].split("");
      x[i] = x[i].join(separator);
    }
    return x.join(" ");
  }