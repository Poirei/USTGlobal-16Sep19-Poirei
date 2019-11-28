//Using Named Function :

function circum_nf(n) {
    console.log(`The circumference of circle having radius `+n+` is`, 2 * Math.PI * n);
}
circum_nf(10);

console.log('**************************************************')

//Using Function Expression / Anonymous Function :

var circum_af = function(n) {
    console.log(`The circumference of circle having radius `+n+` is`, 2 * Math.PI * n);
}
circum_af(20);

console.log('**************************************************')

// Using IIFE / Self Invoked Function :

;(function(n) {
    console.log(`The circumference of circle having radius `+n+` is`, 2 * Math.PI * n);
})(30)

console.log('**************************************************')

// Using Fat Function :

var fibo_ff = n => {
    console.log(`The circumference of circle having radius `+n+` is`, 2 * Math.PI * n);
}
fibo_ff(40);

console.log('**************************************************')
