function lastDigit(n, d) {
    if (d <= 0){
      return [];
    }  
    return (''+n).slice(-d).split('').map(x => parseInt(x))
  }