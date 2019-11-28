// Using Named Function :

function prime_nf(n) {
    if (n === 1) {
        console.log('0 is a prime no.');
    } else {
        var count = 2;
        var i = 2;
        while (i <= n/2) {
            if (n % i === 0)
                count++;
            i++;
        }
        if (count >= 3) {
            console.log(n+" is not a prime no.")
        }
        else {
            console.log(n+` is a prime no.`)
        }
    }
}
prime_nf(7)

console.log('**************************************************')

//Using Function Expression / Anonymous Function :

var prime_af = function(n) {
    if (n === 1) {
        console.log('0 is a prime no.');
    } else {
        var count = 2;
        var i = 2;
        while (i <= n/2) {
            if (n % i === 0)
                count++;
            i++;
        }
        if (count >= 3) {
            console.log(n+" is not a prime no.")
        }
        else {
            console.log(n+` is a prime no.`)
        }
    }
}
prime_af(4)

console.log('**************************************************')

// Using IIFE / Self Invoked Function :

;(function(n) {
    if (n === 1) {
        console.log('0 is a prime no.');
    } else {
        var count = 2;
        var i = 2;
        while (i <= n/2) {
            if (n % i === 0)
                count++;
            i++;
        }
        if (count >= 3) {
            console.log(n+" is not a prime no.")
        }
        else {
            console.log(n+` is a prime no.`)
        }
    }
})(101)

console.log('**************************************************')

// Using Fat Function :

var prime_ff = n => {
    if (n === 1) {
        console.log('0 is a prime no.');
    } else {
        var count = 2;
        var i = 2;
        while (i <= n/2) {
            if (n % i === 0)
                count++;
            i++;
        }
        if (count >= 3) {
            console.log(n+" is not a prime no.")
        }
        else {
            console.log(n+` is a prime no.`)
        }
    }
}
prime_ff(39)