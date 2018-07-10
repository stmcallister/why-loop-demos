function Person(){
  let that = this;
  that.age = 0;

  setInterval(function() {
    that.age++; 
    console.log('interval.this: '+ JSON.stringify(that));
  }, 1000);
}

var p = new Person();
