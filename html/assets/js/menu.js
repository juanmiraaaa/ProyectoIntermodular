document.addEventListener("DOMContentLoaded", function () {
    const menuToggle = document.getElementById("menu-toggle"); // Botón del menú hamburguesa
    const menu = document.getElementById("menu"); // Contenedor del menú

    function sendHeight() {
        setTimeout(() => {
            window.parent.postMessage(document.body.scrollHeight, "*");
        }, 10); // Pequeño delay para asegurar que el DOM se actualiza antes de enviar la altura
    }

    // Enviar altura al cargar la página
    sendHeight();

    // Evento para abrir/cerrar el menú
    menuToggle.addEventListener("click", function () {
        menu.classList.toggle("open");
        sendHeight(); // Ajustar la altura cuando cambia el menú
    });

    // Observar cambios en el DOM (si el menú cambia de tamaño)
    const observer = new MutationObserver(sendHeight);
    observer.observe(menu, { attributes: true, childList: true, subtree: true });

    window.onresize = sendHeight; // Ajustar altura si cambia el tamaño de la ventana
});
