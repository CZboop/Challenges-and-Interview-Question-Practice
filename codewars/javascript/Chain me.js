function chain(input, fs) {
    for (f of fs){
      input = f(input);
    }
    return input;
  }