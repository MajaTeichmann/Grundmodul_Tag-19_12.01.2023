//TODO: Ein Supermarkt gibt Gutscheine aus. Je nachdem wie viel ein Kunde im Supermarkt bei einem Einkauf
// bezahlt, bekommt der Kunde einen Gutschein.
// Aufgabe:
// Schreibe eine Funktion, die den Namen des Kunden und den Preis des Einkaufs erhält, den Gutscheinwert
// berechnet und den Namen des Kunden mit dem Gutscheinwert in der Konsole ausgibt.
// Wenn der Kunde für seinen Einkauf weniger als 50 € bezahlt, bekommt der Kunde keinen Gutschein.
// Wenn der Kunde für seinen Einkauf zwischen 50 € und 100 € bezahlt, bekommt der Kunde einen Gutschein im
// Wert von 10 €.
// Wenn der Kunde für seinen Einkauf mehr als 100 € bezahlt, bekommt der Kunde einen Gutschein im Wert von 20 €.
// Testet euren Code, wie in den anderen Übungen.
// Überlegt euch dazu, wie ihr euren Code testen könnt.

fun main() {
    supermarkt()
}

fun supermarkt(){
    println("Hallo lieber Kunde! Verraten Sie mir bitte Ihren Namen!")
    var kundenName = readln()
    if(!kundenName.contains("[0-9]".toRegex())) { //mithilfe von Philipp Wiesner

        println("Für wieviel Euro haben Sie eingekauft, ${kundenName}?")
        var preisDesEinkaufs = readln().toInt()
        println("Vielen Dank für Ihren Einkauf über ${preisDesEinkaufs}€!")
        if(preisDesEinkaufs >0 && preisDesEinkaufs <50){
            println("Sie bekommen heute leider keinen Gutschein, ${kundenName}!")
            } else if(preisDesEinkaufs >=50 && preisDesEinkaufs <=100){
            println("Sie bekommen heute einen Gutschein über 10€, ${kundenName}!")
            } else if(preisDesEinkaufs >100){
                println("Sie bekommen heute einen Gutschein über 20€, ${kundenName}!")
            } else{
                println("Bitte überprüfen Sie Ihre Eingaben, ${kundenName} und versuchen Sie es erneut!")
                return supermarkt()
            }
        }else{
        println("Normalerweise enthalten Namen keine Zahlen... Versuche es doch einfach nochmal ohne Zahlen!")
        return supermarkt()
    }
}