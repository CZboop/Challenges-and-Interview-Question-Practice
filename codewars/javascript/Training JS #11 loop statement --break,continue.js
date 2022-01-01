function grabDoll(dolls){
    var bag=[];
    for (i in dolls){
      if (bag.length==3){
        break;
      }
      else if (dolls[i]!='Hello Kitty' && dolls[i]!='Barbie doll') continue;
      else{
        bag.push(dolls[i])
      }
    }
    return bag;
  }