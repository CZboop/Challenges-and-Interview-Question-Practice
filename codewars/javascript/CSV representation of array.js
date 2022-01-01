function toCsvText(array) {
    var csv = [];
    for (thing in array){
      var thing = array[thing];
      var temp = [];
      for (i in thing){
        temp.push(thing[i].toString());
      }
      temp = temp.join(",");
      csv.push(temp);
    }
    return csv.join('\n');
  }