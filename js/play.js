const img = document.querySelector('.containerImg')
const text = document.querySelector('.containerText')
const button = document.querySelectorAll('.mostrarOsalir')
const mapa = document.querySelector('.containerMap')

window.addEventListener('load', () => {
    text.classList.add('mostrarText')
    img.classList.add('mostrarImg')
    setTimeout( () => {
        text.classList.add('quitarOpacidad')
        img.classList.add('quitarOpacidad') 
    }, 400)
})

button.forEach(element => {
    element.addEventListener('click', () =>{
        mapa.classList.toggle('mostrarMapa')
    }) 
}); 
    
