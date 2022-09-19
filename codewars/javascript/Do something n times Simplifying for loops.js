Number.prototype.times = function (f) {
    //   using value of the number the new method is called on
      for (let i = 0; i < this.valueOf(); i++){
        f(i);
      }
    }