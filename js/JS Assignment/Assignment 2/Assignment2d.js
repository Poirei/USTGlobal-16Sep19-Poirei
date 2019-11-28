//Using Named Function :

function arr_nf(n) {
    var arr = [1, 2, 3, 4];
    console.log(arr);
    arr[arr.length] = n;
    console.log(arr);
    var sum = 0;
    for (var index = 0; index < arr.length; index++) {
        sum += arr[index];
    }
    console.log(`Sum =`, sum);
}
arr_nf(5);

console.log('**************************************************')

//Using Function Expression / Anonymous Function :

var arr_af = function(n) {
    var arr = [1, 2, 3, 4];
    console.log(arr);
    arr[arr.length] = n;
    console.log(arr);
    var sum = 0;
    for (var index = 0; index < arr.length; index++) {
        sum += arr[index];
    }
    console.log(`Sum =`, sum);
}
arr_af(7)

console.log('**************************************************')

// Using IIFE / Self Invoked Function :

;(function(n) {
    var arr = [1, 2, 3, 4];
    console.log(arr);
    arr[arr.length] = n;
    console.log(arr);
    var sum = 0;
    for (var index = 0; index < arr.length; index++) {
        sum += arr[index];
    }
    console.log(`Sum =`, sum);
})(6)

console.log('**************************************************')

// Using Fat Function :

var arr_ff = n => {
    var arr = [1, 2, 3, 4];
    console.log(arr);
    arr[arr.length] = n;
    console.log(arr);
    var sum = 0;
    for (var index = 0; index < arr.length; index++) {
        sum += arr[index];
    }
    console.log(`Sum =`, sum);
}
arr_ff(18.6);

console.log('**************************************************')
