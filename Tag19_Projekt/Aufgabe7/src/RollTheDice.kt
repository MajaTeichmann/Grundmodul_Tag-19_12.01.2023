import kotlin.random.Random.Default.nextInt

//Todo: Erstellen wir uns ein kleines Würfelspiel.
// a) Schreibe ein kleines Programm, dass ein simples Würfelspiel darstellen soll.
// Es gibt zwei Spieler, erst würfelt Spieler1, dann würfelt Spieler2, anschließend werden die gewürfelten Augenzahlen
// miteinander verglichen.
// Wer die höhere Augenzahl würfelt, gewinnt.
// Würfeln beide Spieler die gleiche Augenzahl, gewinnt kein Spieler, es ist ein Gleichstand.
// Gib eine Nachricht in der Konsole aus, die angibt, welcher Spieler gewonnen hat oder das ein Gleichstand gewürfelt wurde.
// Gib auch die gewürfelten Augenzahlen aus.
// Hinweis: So bekommt man einen zufälligen Integer zwischen 1 und 6 und legt ihn in der Variable roll ab:
// var roll: Int = nextInt(1, 7)


// Todo: b)Veränder dein Programm.
//  Wenn beim ersten Würfeln ein Gleichstand entstanden ist, soll jetzt noch ein zweites Mal gewürfelt werden.
//  Gib eine Nachricht in der Konsole aus, die angibt, welcher Spieler gewonnen hat oder das ein Gleichstand gewürfelt wurde.

var list = listOf<Int>(1,2,3,4,5,6)
fun main() {
    println("Runde 1:")
    dice(list.random(),list.random())
    println("Runde 2:")
    dice(list.random(),list.random())
    println("Runde 3:")
    dice(list.random(),list.random())
}

fun dice(player1: Int, player2: Int){

//    var roll: Int = nextInt(1, 7)

    if(player1 == player2){
        println("${player1} vs. ${player2}")
        println("Unentschieden! Diese Match wird wiederholt!")
        return dice(list.random(),list.random())
    } else if(player1 > player2){
        println("${player1} vs. ${player2}")
        println("Player 1 gewinnt!")
    } else if(player1 < player2){
        println("${player1} vs. ${player2}")
        println("Player 2 gewinnt!")
    }
}