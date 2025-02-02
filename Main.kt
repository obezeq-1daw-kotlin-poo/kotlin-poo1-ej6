fun main() {
    val repo = RepositorioCompras()

    val domicilio1 = Domicilio("Calle Principal", 100)
    val domicilio2 = Domicilio("Avenida Central", 200)

    val cliente1 = Cliente("Carlos", domicilio1)
    val cliente2 = Cliente("Mariana", domicilio2)
    val cliente3 = Cliente("Pedro", domicilio1)

    repo.agregarCompra(Compra(cliente1, "2025-02-01", 120.0))
    repo.agregarCompra(Compra(cliente2, "2025-02-02", 220.0))
    repo.agregarCompra(Compra(cliente3, "2025-02-03", 320.0))

    println("Domicilios para enviar factura:")
    for (domicilio in repo.domicilios()) {
        println(domicilio.dirCompleta())
    }
}