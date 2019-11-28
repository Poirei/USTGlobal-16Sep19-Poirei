/* let element1 = document.getElementById('demo')
console.log(element1);
console.log(element1.textContent)
element1.textContent = 'Bye Bye World !!'
console.log('================================');
let button = document.createElement('button')
console.log(button);
button.textContent = 'Click Me'
document.body.appendChild(button)
console.log('================================');
let ul = document.createElement('ul')
let li1 = document.createElement('li')
let li2 = document.createElement('li')
let li3 = document.createElement('li')
let li4 = document.createElement('li')

li1.textContent = 'JAVA'
li2.textContent = 'DART'
li3.textContent = 'SQL'
li4.textContent = 'JAVASCRIPT'

ul.appendChild(li1)
ul.appendChild(li2)
ul.appendChild(li3)
ul.appendChild(li4)

document.body.appendChild(ul)

element1.style.color = 'red'
element1.style.fontSize = '48px'
element1.style.backgroundColor = 'honeydew'
element1.style.cssFloat = 'left'
 */

let showMessage = () => alert('Message Shown..')
let changeColor = () => {
    let pElement = document.getElementById('mover')
    pElement.style.color = 'green'}
let restoreColor = () => {
    let pElement = document.getElementById('mover')
    pElement.style.color = '';
}
let printHello = () => {
    console.log('Hello!!');
    let userName = document.getElementById('username').value
    document.getElementById('showusername').textContent = 'Hello, '+ userName
}
let name = 'Poirei'
let age = 21, phoneNo = 7013070619
console.log('Name is ' + name + ' Age is ' + age + ' Phone No is ' + phoneNo);
console.log(`Name is ${name} Age is ${age} Phone No. is ${phoneNo}`);
