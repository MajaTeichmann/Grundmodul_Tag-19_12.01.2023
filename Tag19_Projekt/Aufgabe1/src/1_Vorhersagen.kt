//TODO: Schau dir den Codeausschnitt an.
// Was wird hier ausgegeben?
// Notiere dir deine Antwort. (z.B. in einem Kommentar)
// Führe dann den Code aus.
// Wird das ausgegeben, was du dir notiert hast?

/*
* Schreibe hier deine Lösung hin: Heute fahre ich zum See
*
* */

fun main() {
    val sunnyDay: Boolean = true
    val rainy: Boolean = false
    if (sunnyDay) {
        if (!rainy) {
            println("Heute fahre ich zum See")
        }
    } else {
        println("Heute bleibe ich zu Hause")
    }
}