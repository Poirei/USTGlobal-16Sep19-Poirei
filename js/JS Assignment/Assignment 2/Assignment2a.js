//Using Named Function :

function fact_nf(n) {
    var fact = 1;
    if (n === 0) {
        console.log('The factorial of 0 is 1.');
    } else {
        for (var index = n; index >= 1; index--) {
            fact *= index;
        }
    }
    console.log('The factorial of '+n+' is',fact+'.');
}
fact_nf(5);

console.log('**************************************************')

//Using Function Expression / Anonymous Function :

var fact_af = function(n) {
    var fact = 1;
    if (n === 0) {
        console.log('The factorial of 0 is 1.');
    } else {
        for (var index = n; index >= 1; index--) {
            fact *= index;         
        }
    }
    console.log('The factorial of '+n+' is',fact+'.');
}
fact_af(10)

console.log('**************************************************')

// Using IIFE / Self Invoked Function :

;(function(n) {
    var fact = 1;
    if (n === 0) {
        console.log('The factorial of 0 is 1.');
    } else {
        for (var index = n; index >= 1; index--) {
            fact *= index;         
        }
    }
    console.log('The factorial of '+n+' is',fact+'.');
})(4)

console.log('**************************************************')

// Using Fat Function :

var fact_ff = (n) => {
    var fact = 1;
    if (n === 0) {
        console.log('The factorial of 0 is 1.');
    } else {
        for (var index = n; index >= 1; index--) {
            fact *= index;         
        }
    }
    console.log('The factorial of '+n+' is',fact+'.');
}
fact_ff(20)
console.log('**************************************************')