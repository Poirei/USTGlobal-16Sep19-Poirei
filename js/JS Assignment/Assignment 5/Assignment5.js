let check = () => {
    let userName = document.getElementById('name')
    let passWord = document.getElementById('pass')
    if (userName.textContent.trim().length < 5 && passWord.textContent.trim().length < 6) {
    let button = document.getElementById('btn')
    button.disabled = 'true'
    button.style.backgroundColor = 'grey'
    } else if () {
    
    }
}
let showOrHidePassword = () => {
    let obj = document.getElementById('pass')
    if (obj.type === 'password') {
        return obj.type = 'text'
    } else {
        return obj.type = 'password'
    }
}
