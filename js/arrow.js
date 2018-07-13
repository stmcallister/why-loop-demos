function Person(){
  this.age = 0;

  setInterval(() => {
    this.age++; 
    console.log('interval.this: '+ JSON.stringify(this));
  }, 1000);
}

var p = new Person();
