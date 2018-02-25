let abc = function() {
    console.log(this === global);
}
abc();