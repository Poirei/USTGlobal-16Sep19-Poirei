console.log('Window object :', window);
console.log('This keyword :', this);
console.log(this === window);
alert('Missile alert ~~=>')
let confirmDelete = confirm('Are you sure you want some more Bakchodi/ Chutiyapa ?')
console.log('Yo :', confirmDelete);
let userName = prompt('What is your name ?', 'Gautam')
console.log('Username =', userName);
console.log(`=========================================`);
const person = {
    firstName : 'K.Poirei Ngamba',
    lastName : 'Singha',
    age : 24,
    getName : () => {return this.firstName+' '+this.lastName}
}
let fullName = person.getName()
console.log('Full Name :', fullName);