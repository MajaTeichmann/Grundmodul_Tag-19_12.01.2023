
<h1 align="center">Grundlagen der Programmierung</h1>
<h3 align="center">Verzweigungen</h3>
<br>



#### Beschreibung:

- Willkommen zu den Aufgaben von Tag 19! 

#### Hinweise zur Bearbeitung:

- Achte auf einen sauberen Quellcode, insbesondere Einrückungen sind wichtig!
- Wichtige Materialien für heute:
  - [Handbuch: Verzweigungen → Verstehen → Vergleichsoperatoren](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.fj07e277r4z)
  - [Handbuch: Verzweigungen → Implementieren → Ist-Gleich-Operator (==) implementieren](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.vqqvzaa3kyui)
  - [Handbuch: Verzweigungen → Implementieren → Ist-Ungleich-Operator (!=) implementieren](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.p8nsnn5aff3)
  - [Handbuch: Verzweigungen → Implementieren → Ist-Größer-Als-Operator (>) implementieren](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.v1ziw8geoh0x)
  - [Handbuch: Verzweigungen → Implementieren → Ist-Größer-Gleich-Operator (>=) implementieren](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.jlgz4x547gco)
  - [Handbuch: Verzweigungen → Implementieren → Ist-Kleiner-Als-Operator (<) implementieren](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.yll2vye63ggu)
  - [Handbuch: Verzweigungen → Implementieren → Ist-Kleiner-Gleich-Operator (<=) implementieren](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.z7av547qy906)

---


<details>
<summary><b>Aufgabe 1 - Code vorhersagen </b></summary>

Schau dir den Codeausschnitt an.
- Was wird hier ausgegeben?

Notiere dir deine Antwort. (z.B. in einem Kommentar)  
Führe dann den Code aus.
- Wird das ausgegeben, was du dir notiert hast?

````
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
````

**Modul für die Aufgabe:** *Aufgabe1*  
**Datei für die Aufgabe:** *1_Vorhersagen.kt*

</details>

---

<details>
<summary><b>Aufgabe 2 - Code vorhersagen </b></summary>

Schau dir den Codeausschnitt an.
- Was wird hier ausgegeben?

Notiere dir deine Antwort. (z.B. in einem Kommentar)  
Führe dann den Code aus.
- Wird das ausgegeben, was du dir notiert hast?

````
fun main() {
    val uhrzeit: Int = 7
    val arbeitstag: Boolean = true
    val regen: Boolean = false
    if (uhrzeit >= 6) {
        println("Der Wecker klingelt")
        if (!arbeitstag) {
            println("Ich bleibe einfach liegen")
        } else {
            println("Ich mache mich für den Tag bereit")
            if (regen) {
                println("Ich fahre mit dem Auto")
            } else {
                println("Heute nehme ich das Fahrrad")
            }
        }
    }
}
````

**Modul für die Aufgabe:** *Aufgabe2*  
**Datei für die Aufgabe:** *2_Vorhersagen.kt*

</details>


---

<details>
<summary><b>Aufgabe 4 - Code vorhersagen </b></summary>

Schau dir den Codeausschnitt an.
- Was wird hier ausgegeben?

Notiere dir deine Antwort. (z.B. in einem Kommentar)  
Führe dann den Code aus.
- Wird das ausgegeben, was du dir notiert hast?

````
fun main() {
    elementInListe("The Wire")
    elementInListe("Breaking Bad")
    elementInListe("The Office")
}

fun elementInListe(element: String) {
    val serien: List<String> = listOf("Game of Thrones", "How i Met your Mother", "Breaking Bad", "Stranger Things")
    val serieInListe = serien.contains(element)
    if (serieInListe) {
        println("Die Serie $element befindet sich in der Liste")
    } else {
        println("Die Serie $element befindet sich nicht in der Liste")
    }
}
````

**Modul für die Aufgabe:** *Aufgabe4*  
**Datei für die Aufgabe:** *4_Vorhersagen.kt*

</details>

---

<details>
<summary><b>Aufgabe 5 - Code vorhersagen </b></summary>

In dem gegebenen Code soll eine Ampelschaltung simuliert werden. 
Die Logik für die Schaltung liegt in der Funktion ampel(), die in der main()-Funktion nur aufgerufen wird.

Schau dir den Codeausschnitt an.
- Was wird hier ausgegeben?

Notiere dir deine Antwort. (z.B. in einem Kommentar)  
Führe dann den Code aus.
- Wird das ausgegeben, was du dir notiert hast?


````
fun main() {
    var ampelPhase = "Grün"
    ampelPhase = ampel(ampelPhase)
    ampelPhase = ampel(ampelPhase)
    ampel(ampelPhase)
}

fun ampel(phase: String): String {
    var neuePhase: String = phase
    when (phase) {
        "Grün" -> {
            println("Die Ampel leuchtet grün, also dürfen die Autos jetzt fahren")
            neuePhase = "Gelb"
        }

        "Gelb" -> {
            println("Die Ampel leuchtet gelb, also müssen die Autos sich zum Anhalten bereit machen")
            neuePhase = "Rot"
        }

        "Rot" -> {
            println("Die Ampel leuchtet rot, also müssen die Autos warten")
            neuePhase = "Grün"
        }
    }
    return neuePhase
}
````

**Modul für die Aufgabe:** *Aufgabe5*  
**Datei für die Aufgabe:** *5_Vorhersagen.kt*

</details>


---

<details>
<summary><b>Aufgabe 6 - Gutscheine </b></summary>

Ein Supermarkt gibt Gutscheine aus. Je nachdem wie viel ein Kunde im 
Supermarkt bei einem Einkauf bezahlt, bekommt der Kunde einen Gutschein. 

Aufgabe:

- Schreibe eine Funktion, die den Namen des Kunden und den Preis des Einkaufs
erhält, den Gutscheinwert berechnet und den Namen des Kunden mit dem Gutscheinwert
in der Konsole ausgibt. 
- Wenn der Kunde für seinen Einkauf weniger als 50 € bezahlt, 
bekommt der Kunde keinen Gutschein.  
- Wenn der Kunde für seinen Einkauf zwischen 50 € und 100 € bezahlt,
  bekommt der Kunde einen Gutschein im Wert von 10 €.  
- Wenn der Kunde für seinen Einkauf mehr als 100 € bezahlt, 
  bekommt der Kunde einen Gutschein im Wert von 20 €.  

Testet euren Code, wie in den anderen Übungen.   
Überlegt euch dazu, wie ihr euren Code testen könnt.

**Modul für die Aufgabe:** *Aufgabe6*  
**Datei für die Aufgabe:** *Gutschein.kt*

</details>


---

<details>
<summary><b>Aufgabe 7 - Würfelspiel </b></summary>

Erstellen wir uns ein kleines Würfelspiel.

a)

Schreibe ein kleines Programm, dass ein simples Würfelspiel darstellen soll.   
Es gibt zwei Spieler, erst würfelt Spieler1, dann würfelt Spieler2, anschließend werden die gewürfelten 
Augenzahlen miteinander verglichen.  
Wer die höhere Augenzahl würfelt, gewinnt.  
Würfeln beide Spieler die gleiche Augenzahl, gewinnt kein Spieler, es ist ein Gleichstand.  
Gib eine Nachricht in der Konsole aus, die angibt, welcher Spieler gewonnen hat oder das 
ein Gleichstand gewürfelt wurde.  
Gib auch die gewürfelten Augenzahlen aus.  

Hinweis: So bekommt man einen zufälligen Integer zwischen 1 und 6 und legt ihn in der Variable *roll* ab:  
`var roll: Int = nextInt(1, 7)`

b) 

Veränder dein Programm.  
Wenn beim ersten Würfeln ein Gleichstand entstanden ist, soll jetzt noch ein zweites Mal gewürfelt werden.  
Gib eine Nachricht in der Konsole aus, die angibt, welcher Spieler gewonnen hat oder das
ein Gleichstand gewürfelt wurde.

**Modul für die Aufgabe:** *Aufgabe7*  
**Datei für die Aufgabe:** *RollTheDice.kt*

</details>

---

<details>
<summary><b>Aufgabe 8 - If-Else in Funktionen </b></summary>

In dieser Aufgabe sollt ihr eine eigene Funktion schreiben, die prüfen soll, ob zwei Werte gleich sind.
Gib dann in der Konsole aus, ob die zwei Werte gleich sind.

Teste deine Funktion, indem du in der main()-Funktion zwei Listen mit Namen von Personen anlegst.  
Dabei soll mindestens ein Name in beiden Listen vorkommen.  
Rufe dann deine Funktion in der main()-Funktion mehrmals auf und gib als Parameter zwei Namen, 
jeweils einen Namen pro Liste, mit.  
Ändere die Parameter dabei bei jedem Aufruf deiner Funktion.  
Erkennt deine Funktion die gleichen Namen?

**Modul für die Aufgabe:** *Aufgabe8*  
**Datei für die Aufgabe:** *Comparison.kt*

</details>

---








