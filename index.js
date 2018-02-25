'use strict'
let Test = function (name) {
    this.name = name;
    this.printName = function (){
        console.log(this.name);
    }
};

let test = new Test('anand');
//let test2 = Test('anand2'); // does not work, this not defined with this
console.log(test.name);
//console.log(test2.name); //TypeError: Cannot set property 'name' of undefined , line no. 3 from the constructor

let obj = {
    0: 'hello',
    1: 'namastey',
    2: '80'
};

let arr = Array.from(obj);
console.log(arr);

