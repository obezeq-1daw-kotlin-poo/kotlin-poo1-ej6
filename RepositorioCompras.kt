class RepositorioCompras {
    private val compras = mutableListOf<Compra>()

    fun agregarCompra(compra: Compra) {
        compras.add(compra)
    }

    fun domicilios(): Set<Domicilio> {
        val listaDomicilios = mutableSetOf<Domicilio>()
        for (compra in compras) {
            listaDomicilios.add(compra.cliente.domicilio)
        }
        return listaDomicilios
    }
}