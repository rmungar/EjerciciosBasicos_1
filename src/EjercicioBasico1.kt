class persona(var peso: Double, var altura: Double){

    var nombre: String = ""
    var imc:Double = 0.00
    init {
        this.imc = (this.peso/(this.altura * this.altura))
    }

    constructor(nombre:String, peso: Double, altura: Double) : this(peso, altura){
        this.nombre = nombre
    }

    fun cambiarNombre(){
        var nom = ""
        print("Ingresa el nuevo nombre: ")
        nom = readln()
        if (nom != this.nombre) {
            this.nombre = nom
            println("Nombre cambiado a $nom")
        }
        else println("Nombre no modificado")
    }

    fun cambiarImc(){
        var pes = 0.0
        var alt = 0.0
        print("Introduzca su nuevo peso: ")
        pes = readln().toDouble()
        if (pes.toString() != ""){
            println("Peso cambiado")
            this.peso = pes
        }
        else println("Peso no cambiado")
        print("Introduzca su nueva altura: ")
        alt = readln().toDouble()
        if (alt.toString() != ""){
            println("Altura cambiada")
            this.altura = alt
        }
        else println("Altura no cambiada")
    }
}