//TODO: In dieser Aufgabe sollt ihr eine eigene Funktion schreiben, die prüfen soll, ob zwei Werte gleich sind.
// Gib dann in der Konsole aus, ob die zwei Werte gleich sind.
// Teste deine Funktion, indem du in der main()-Funktion zwei Listen mit Namen von Personen anlegst.
// Dabei soll mindestens ein Name in beiden Listen vorkommen.
// Rufe dann deine Funktion in der main()-Funktion mehrmals auf und gib als Parameter zwei Namen, jeweils einen Namen
// pro Liste, mit.
// Ändere die Parameter dabei bei jedem Aufruf deiner Funktion.
// Erkennt deine Funktion die gleichen Namen?

fun main() {
    var wert1 = listOf("Max","Julia","Peter")
    var wert2 = listOf("Max","Moritz","Otto")

    zweiGleicheWerte(wert1.random(), wert2.random())
    zweiGleicheWerte(wert1.random(), wert2.random())
    zweiGleicheWerte(wert1.random(), wert2.random())

//    zweiGleicheWerte("Max","Max")
//    zweiGleicheWerte("Max","Moritz")
//    zweiGleicheWerte("Max","Otto")
//    println("")
//    zweiGleicheWerte("Julia","Max")
//    zweiGleicheWerte("Julia","Moritz")
//    zweiGleicheWerte("Julia","Otto")
//    println("")
//    zweiGleicheWerte("Peter","Max")
//    zweiGleicheWerte("Peter","Moritz")
//    zweiGleicheWerte("Peter","Otto")
}

fun zweiGleicheWerte(wert1: String, wert2: String){
    if(wert1 == wert2){
        println("Die zwei Werte sind gleich!")
    } else{
        println("Die zwei Werte sind NICHT gleich!")
    }
}