const person = {
    name : 'Poirei',
    age : 24,
    color : 'white',
    address : {
        city : 'Bengaluru',
        state : 'Karnataka',
        pin : 560076
    },
    hobbies : ['Coding', 'Drawing', 'Music Composing']
}
console.log('JavaScript person object :', person);
const jsonObject = JSON.stringify(person)
console.log('JSON person object :', jsonObject);
console.log(JSON.parse(jsonObject));
localStorage.setItem('email', 'poirei4@gmail.com')
console.log('Email :', localStorage.getItem('email'));
localStorage.clear();
console.log(localStorage.getItem('email'));