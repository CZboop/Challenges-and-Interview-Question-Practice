Array.prototype.reverse = function() {
    let len = this.length;
    for (let i = 0; i < Math.floor(len/2); i++){
      [this[i], this[len - 1 - i]] = [this[len - 1- i], this[i]]
    }
    return this;
  };