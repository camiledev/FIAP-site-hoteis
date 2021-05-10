const acessibilidade = document.querySelector('.acessibilidade');
const html = document.querySelector('html');

acessibilidade.addEventListener('click', function(){
    html.classList.toggle('blackwhite');
});

const cabecalho_text = document.querySelector('.cabecalho_texto');
cabecalho_text.focus();

