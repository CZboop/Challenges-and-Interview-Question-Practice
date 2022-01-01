function keysAndValues(data){
    var keys = [];
    var vals = [];
    for (const [key,value] of Object.entries(data)){
      keys.push(key);
      vals.push(value);
    }
    return [keys, vals];
  }