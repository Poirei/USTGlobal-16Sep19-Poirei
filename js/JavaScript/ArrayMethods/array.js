const hobbies = ['sleeping', 'eating', 'painting', 'coding',
                'reading']
console.log(typeof hobbies);
console.log(Array.isArray(hobbies));
console.log(hobbies.includes('coding', 2))
console.log(hobbies.push('Skating', 'Cycling'))
console.log(hobbies);
console.log(hobbies.pop())
console.log(hobbies.indexOf('Cycling'));
console.log(hobbies.pop());
console.log(hobbies.unshift('Numismatics', 'Singing'));
console.log(hobbies);
console.log(hobbies.shift());
console.log('==========================================');
const brand = ['Yamaha', 'Ducati', 'BMW', 'Hero']
brand.splice(brand.length, 0, 'Royal Enfield', 'Bajaj')
console.log(brand);
brand.splice(brand.length-2, 1)
console.log(brand);
console.log(brand.slice(1, 2))
console.log(brand.indexOf('Ducati', 1));
console.log(brand.join('-'));
// console.log(brand.concat(hobbies))
const numbers = [10, 20, 30, 40, 50, 60, 70, 80]
console.log(numbers);
const numbers1 = numbers.map(value => value + 50)
console.log(numbers1);
const numbers2 = numbers.map(function(value, index) {
    return value + 50
}) 
console.log(numbers2);
console.log(numbers.filter(function(value, index) {
    if (value > 20) {
        return true;
    } else 
        return false;
}));
console.log(numbers.filter(value => value > 20));