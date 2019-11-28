function first(callback) {
    setTimeout(function() {
        console.log(`First Function Executed`)
        callback()
    },5000)
}
console.log('Executed');
function second() {
    console.log(`Second Function Executed`)
}

first(second)
// second()
