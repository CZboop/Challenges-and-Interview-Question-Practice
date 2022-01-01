function fiveLine(s){
    s = s.trim();
    var st = "";
    var count = 1;
    for (i in [...Array(5).keys()]){
      for (j=0; j<count; j++){
        st+=s;
      }
      count++;
      st+="\n";
    }
    return st.trim();
  }