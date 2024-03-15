import java.util.*
import kotlin.random.Random

fun main(args: Array<String>) {
    var matriz = Array(4) { Array<Int>(4) { Random.nextInt(1, 9)} }
    var sumaFilas = Array(matriz.size){0}
    var sumaColum = Array(matriz[0].size){0}


    ImprimeMatriz(matriz)
    sumaFilas(matriz, sumaFilas)

    sumaColumnas(matriz,sumaColum)
    println("La suma de las filas es")
    println(Arrays.toString(sumaFilas))
    println("La suma de las columnas es")
    println(Arrays.toString(sumaColum))
    println( totalFilasYColumnas(sumaFilas,sumaColum))

}

private fun totalFilasYColumnas(sumaFilas: Array<Int>, sumaColum: Array<Int>):String{
    return (sumaFilas.size+sumaColum.size).toString()}

private fun ImprimeMatriz(matriz: Array<Array<Int>>) {
    for (fila in matriz.indices) {
        for (c in matriz[fila].indices) {
            print("${matriz[fila][c]} ")
        }
        println()
    }
}

fun sumaColumnas (m:Array<Array<Int>>, sumaColumnas:Array<Int>){
    var fila: Int = 0
    var columna: Int = 0

    while (columna < m.size){
        while (fila < m[0].size){
            sumaColumnas[columna] += m[fila][columna]
            fila++
        }
        fila = 0
        columna++
    }
    
}

private fun sumaFilas(m: Array<Array<Int>>, sumaFilas: Array<Int>) {
    var fila: Int = 0
    var columna: Int = 0

    while (fila < m.size) {
        while (columna < m[0].size) {
            sumaFilas[fila] += m[fila][columna]
            columna++
        }
        columna = 0
        fila++
    }
}





