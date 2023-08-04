const button = document.querySelector('.cta')
const footer = document.querySelector('footer')
const form = document.querySelector('form')

button.addEventListener('click', () =>{
    footer.classList.toggle('mostrar')
    if(button.innerHTML == 'buscar lugares'){
        button.textContent = 'ocultar'
    }
    else{
        button.textContent = 'buscar lugares'
    }
    setTimeout( () =>{
        form.classList.toggle('mostrarForm')
    }, 400)
})

