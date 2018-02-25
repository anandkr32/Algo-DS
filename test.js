let x = 2;

sum();

x = 8;
console.log('after changing x');
sum();

function sum () {
    console.log(x+4);
}

function makeCounter() {
    let count = 0;
    return function() {
      return count++;
    };
  };

  let counter = makeCounter();
  let counter2 = makeCounter();

  console.log(counter());

  