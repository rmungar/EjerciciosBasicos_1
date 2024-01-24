fun main() {
    val persona1 = persona(72.00, 180.00)
    val persona2 = persona("MMORPG NO LINEAL", 190.00, 170.00)
    val persona3 = persona("Anthem", 100.00, 78.00)
    persona1.cambiarNombre()
    println("Nombre: ${persona2.nombre}, peso = ${persona2.peso}KG, altura = ${persona2.altura}cms")
    persona3.cambiarImc()
    println(persona3.imc)
}