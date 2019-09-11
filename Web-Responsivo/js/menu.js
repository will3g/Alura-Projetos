document.querySelector('.menu-abrir').onclick = function() { //Abre menu
    document.documentElement.classList.add('menu-ativo');
};

document.querySelector('.menu-fechar').onclick = function() { //Fecha menu
    document.documentElement.classList.remove('menu-ativo');
};

document.documentElement.onclick = function(event) { //Serve para fechar o menu na parte escura
    if (event.target === document.documentElement) {
        document.documentElement.classList.remove('menu-ativo');
    }
};
