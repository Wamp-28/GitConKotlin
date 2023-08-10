import java.text.DecimalFormat
import kotlin.math.ceil
import kotlin.math.floor

fun main() {
/*
    println("Hola Kotlin")

    // TIPOS DE  VARIABLES

    // VARIABLES var -> Cambian con el tiempo
    // CONSTANTES val -> No cambian

    var num1 = 5

    num1 = 25

    var nota = 3.5

    var nombre = "Pedro"

    var letra = 'D'

    var num2:Int = 15

    var final:Double = 3.8

    var apellido:String = "Lopez"

    val pi = 3.141516

    val fecha = "15-08-1997"

    var suma = num1+num2
    var resta = num1-num2
    var multi = num1*num2
    var div = num1/num2

    println("LA SUMA ES: $suma")



    println("""
        LA RESTA ES 
        LA QUE SE PRESENTA A CONTINUACION: 
        $resta
    """.trimIndent())

    // CONVERTIR TIPOS DE DATOS

    var nu1= "5"

    var total = nu1.toInt() * 5

    println(" LA SUMA TOTAL ES: $total")


    // COMO INGRESAR DATOS POR TECLADO
   // AT=(B*H)/2
    println("INGRESE EL VALOR DE LA BASE")
    var base = readln().toDouble()

    println("INGRESE EL VALOR DE LA ALTURA")
    var altura = readln().toDouble()
    var at = (base*altura)/2

    println("""
        
        LOS VALORES INGRESADOS SON: 
        BASE: $base
        ALTURA: $altura
        
        EL AREA DEL TRIANGULO ES: $at
        
    """.trimIndent())

    // uso de biblioteca matematica

    var raiz = Math.sqrt(at.toDouble())

    println("LA RAIZ ES: $raiz ")

    // Redondeo de numeros con las cifras definidas

    println(DecimalFormat("#.###").format(raiz))

    // REDONDEAR NUMEROS HACIA ABAJO

    println(floor(raiz).toInt())

    println(ceil(raiz).toInt())


    // ESTRUCTURAS
    // CONDICIONALES IF - ELSE

    var edad:Int
    println("Ingrese su edad")
    edad = readln().toInt()
    if(edad >= 18 ){
        println("ES MAYOR DE EDAD")
    }else{
        println("ES MENOR DE EDAD")
    }

    // WHEN

    var numero = 2

    when(numero){
        1 -> println("NO ES IGUAL")
        2-> {
            println("NO ES IGUAL")
        }
        3 -> {
            println("Si es igUal")
        }
        else ->
            println("NUMERO NO ENCONTRADO")
    }
*/
    // CICLOS
    /*
    // CICLO FOR

    for (i in 1..100){
        println(i)
    }

    for (j in 100 downTo 1 step 2){
        println(j)
    }
*/
    /*
    // WHILE

    var z = 1

    while(z<=100){

        println(z)
        z++
    }
*/
    // DO WHILE

    var f = 100

    do{

        println(f)
        f-=3



    }while (f>=1)






}
