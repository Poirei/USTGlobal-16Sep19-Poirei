//Using Named Function :

function fibo_nf(n) {
    var a = 0; 
    var b = 1;
    var c;
    if (n === 0)
        return;
    else {
        for (var index = 2; index <= n; index++) {
            c = a + b;
            a = b;
            b = c;
        }
        console.log(`The fibonacci no. is`, b);
    }
}
fibo_nf(10)

console.log('**************************************************')

//Using Function Expression / Anonymous Function :

var fibo_af = function(n) {
    var a = 0; 
    var b = 1;
    var c;
    if (n === 0)
        return;
    else {
        for (var index = 2; index <= n; index++) {
            c = a + b;
            a = b;
            b = c;
        }
        console.log(`The fibonacci no. is`, b);
    }
}
fibo_af(11)

console.log('**************************************************')

// Using IIFE / Self Invoked Function :

;(function(n) {
    var a = 0; 
    var b = 1;
    var c;
    if (n === 0)
        return;
    else {
        for (var index = 2; index <= n; index++) {
            c = a + b;
            a = b;
            b = c;
        }
        console.log(`The fibonacci no. is`, b);
    }
})(10)

console.log('**************************************************')

// Using Fat Function :

var fibo_ff = n => {
    var a = 0; 
    var b = 1;
    var c;
    if (n === 0)
        return;
    else {
        for (var index = 2; index <= n; index++) {
            c = a + b;
            a = b;
            b = c;
        }
        console.log(`The fibonacci no. is`, b);
    }
}
fibo_ff(12)
console.log('**************************************************')
