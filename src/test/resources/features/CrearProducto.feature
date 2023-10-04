#language: es

Característica: Crear un producto nuevo y validar en la lista quedo registrado el producto creado

  @CrearProducto
  Escenario: Crear un producto nuevo y validar en la lista quedo registrado el producto creado
    Cuando el usuario abra el navegador en la url
    Y el usuario ingresa el  usuario y contraseña y da click en iniciar sesion
    Y el usuario de click en More Info de productos
    Y el usuario de click en nuevo Producto
    Y el usuario ingrese Nombre del producto, unidades en stock, unidades en pedido, nivel de reorden y de clicl en guardar
    Y el usuario de  en buscar ingrese producto
    Entonces el usuario visualizara el producto creado en la lista