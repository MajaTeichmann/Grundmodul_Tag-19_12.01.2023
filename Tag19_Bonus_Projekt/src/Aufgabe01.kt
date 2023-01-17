//TODO: In der heutigen Bonusaufgabe sollt ihr wieder mal einen Kampf darstellen. Diesmal kämpft ein Held gegen einen
// Drachen.
// Legt in der main()-Funktion alle benötigten Variablen an, die ihr für nötig haltet, um den Kampf zu simulieren
// (z.B. HP Werte).
// Der Held und der Drache sollen sich abwechselnd angreifen, wobei der Held immer zweimal angreifen
// darf. Der Drache soll dafür aber mehr HP als der Held haben. Die Angriffe sollen zufällig gewürfelt werden.
// Überlegt euch wie stark der Held und der Drache seien sollen. Außerdem sollen Held und Drache Verteidigungswerte
// besitzen und der Held soll noch die Möglichkeit haben seinen Schaden für einen Angriff zu verstärken.
// Lasst den Drachen gegen den Helden antreten und findet raus wer siegreich aus dem Kampf geht. Der Kampf kann enden,
// wenn ein HP Wert auf 0 fällt oder nach einer bestimmten Anzahl an Angriffen.
// Ihr könnt im letzteren Fall z.B. die HP Werte vergleichen und entscheiden, wer gewonnen hat.

// 1) alle benötigten Variablen anlegen (in "fun main()" )
// 2) Held greift 2x mal an, Drache 1x
// 3) DracheHP > HeldHP
// 4) Angriffe zufällig gewürfelt
// 5) Verteidigungswerte Held  & Drache
// 6) Held -> Schaden für Angriff verstärken können
// 7) gegeneinander kämpfen lassen
// 8) wenn HeldHP <= 0 -> Drache gewinnt; wenn DracheHP <= 0 -> Held gewinnt ODER
//    angriffe >= xyz -> HeldHP > DracheHP -> Held gewinnt bzw. HeldHP < DracheHP -> Drache gewinnt

//Hero
var nameOfHero: String = readln()
var gewaehlteWaffe: String = readln()
var hpRangeHero = 90..100
var schadenRange = 1..20
var hpHero = (hpRangeHero.random()) + 3
var neueHpHero = hpHero

// Dragon
var dragonName = listOf<String>(
    "Smaug",
    "Glaurung",
    "Ancalagon",
    "Drogon",
    "Viserion",
    "Rhaegal",
    "King Ghidorah",
    "Malefiz",
    "Jabberwocky",
    "Fuchur",
    "Mushu",
    "Elliot",
    "Grisu",
    "Tabaluga",
    "Ohnezahn",
    "Sturmpfeil",
    "Draco",
    "Saphira",
    "Glaedr",
    "Haku",
    "Shenlong",
    "Nepomuk"
)
var nameOfDragon = dragonName.random()
var hpRangeDragon = 101..111
var hpDragon = hpRangeDragon.random()
var neueHpDragon = hpDragon
var schadenDragon = schadenRange.random()

// Waffen
var schadenWaffe1 = 5..7
var schadenWaffe1FuerKampf = schadenWaffe1.random()
var vorteilWaffe1 = (schadenWaffe1FuerKampf)
var zustandWaffe1 = 20
var nachteilWaffe1 = zustandWaffe1
var einsetzbarkeitWaffe1 = true

var schadenWaffe2 = 7..10
var schdenWaffe2FuerKampf = schadenWaffe2.random()
var zustandWaffe2 = 99
var vorteilWaffe2 = zustandWaffe2
var nachteilWaffe2 = (hpHero) - 4
var einsetzbarkeitWaffe2 = true

var schadenWaffe3 = 12
var schadenWaffe3FuerKampf = schadenWaffe3
var vorteilWaffe3 = (hpHero) + 1
var einsetzbarkeitWaffe3 = listOf<Boolean>(true, true, true, false)
var nachteilWaffe3 = einsetzbarkeitWaffe3
var maxRunden = 5
var rundenGespielt = 0

//Waffen
var waffe1 = """
        |kleines Schwert 
        |Schaden: ${schadenWaffe1} (zufällig)
        |Vorteil: leicht (erhöht zufälligen Helden HP-Wert um 3)
        |Nachteil: Klinge bricht nach 20 Angriffen""".trimMargin()

var waffe2 = """
        |großes Schwert 
        |Schaden: ${schadenWaffe2} (zufällig)
        |Vorteil: Klinge bricht nicht
        |Nachteil: schwer (reduziert zufälligen Helden HP-Wert um 4)""".trimMargin()

var waffe3 = """
        |X-Bogen
        |Schaden: 12
        |Vorteil: leicht (erhöht zufälligen Helden HP-Wert um 1)
        |Nachteil: läd alle 3 Schüsse nach""".trimMargin()

fun main() {
    gameNurRunde1()
    gameAbRunde2()
}

fun gameAbRunde2() {
    if ((neueHpHero >= 1 && neueHpDragon >= 1) || rundenGespielt <= maxRunden) {
        println("Der Kampf beginnt in...")
        println("3...2...1...GO!")
        println("")
        println(
            """
            Du:         ${nameOfHero}                                                       ${nameOfDragon}
            Schaden:    ${schadenWaffe1FuerKampf}                                           ${schadenDragon}
            HP:         ${neueHpHero}                 vs.                                   ${neueHpDragon}""".trimIndent()
        )
        println("")
        neueHpDragon = neueHpDragon - schadenWaffe1FuerKampf - schadenWaffe1FuerKampf
        neueHpHero = neueHpHero - schadenDragon
        println("")
        println(
            """
            |Neue Stats:                HP:
            |${nameOfHero}      ->      ${neueHpHero}
            |${nameOfDragon}    ->      ${neueHpDragon}""".trimMargin()
        )
        println("")
        println("")
        println("")

        rundenGespielt += 1

        println("Nächste Runde kämpfen? j/n")
        var neueRunde = readln()

        if (neueRunde == "j") {
            return gameAbRunde2()
        } else (
                return
        )
    }else if(maxRunden == rundenGespielt || maxRunden <= rundenGespielt){
        println("Die maximale Anzahl an Runden wurde gespielt. Der Gewinner ist:")
        if(hpHero >= hpDragon){
            println("Du hast gewonnen!")
        }else{
            println("Der Drache hat gewonnen!")
        }
    }else if (neueHpHero <= 0) {
        println("Der Drache ${nameOfDragon} hat gewonnen! ${neueHpHero} vs. ${neueHpDragon}")
        return gameNurRunde1()
    } else if (neueHpDragon <= 0) {
        println("Du hast gewonnen! ${neueHpHero} vs. ${neueHpDragon}")
        return gameNurRunde1()
    }
}

fun gameNurRunde1() {
    println("Hallo lieber Kämpfer! Nenne mir doch bitte einen Namen, den du deinem Helden leihen möchtest!")
    nameOfHero = readln()
    println("")
    println("Vielen Dank. Dein Held heißt nun ${nameOfHero}!")
    println("")
    println("Nun wähle eine Waffe:")
    println(
        """Wähle weise:
        |[1] für ${waffe1}
        |
        |[2] für ${waffe2} oder
        |
        |[3] für ${waffe3}""".trimMargin()
    )
    gewaehlteWaffe = readln()

    if (rundenGespielt <= maxRunden) {
        if (gewaehlteWaffe == "1") {
            println("Du hast ${gewaehlteWaffe} gewählt!")
            println("Lass uns deine HP und Stärke deiner Waffe würfeln...")
            println("")
            println("HP: ${hpHero}")
            println("Schaden: ${schadenWaffe1FuerKampf}")
            println("")
            println("Nun bist du bereit gegen den Drachen zu kämpfen!")
            println("Der Kampf beginnt in...")
            println(
                """
                |3
                |2
                |1
                |GO!""".trimMargin()
            )
            println("")
            println(
                """
                        ${nameOfHero}                                                   ${nameOfDragon}
            Schaden:    ${schadenWaffe1FuerKampf}                                       ${schadenDragon}
            HP:         ${hpHero}                   vs.                                 ${hpDragon}""".trimIndent()
            )
            println("")
            neueHpDragon = hpDragon - schadenWaffe1FuerKampf - schadenWaffe1FuerKampf
            neueHpHero = hpHero - schadenDragon
            println("")
            println(
                """
            |Neue Stats:                    HP:
            |${nameOfHero}      ->      ${neueHpHero}
            |${nameOfDragon}    ->      ${neueHpDragon}""".trimMargin()
            )

            rundenGespielt += 1
        }else if (gewaehlteWaffe == "2") {
            println("Du hast ${gewaehlteWaffe} gewählt!")
            println("Lass uns deine HP und Stärke deiner Waffe würfeln...")
            println("")
            println("HP: ${hpHero}")
            println("Schaden: ${schadenWaffe1FuerKampf}")
            println("")
            println("Nun bist du bereit gegen den Drachen zu kämpfen!")
            println("Der Kampf beginnt in...")
            println(
                """
                |3
                |2
                |1
                |GO!""".trimMargin()
            )
            println("")
            println(
                """
                        ${nameOfHero}                                                   ${nameOfDragon}
            Schaden:    ${schadenWaffe1FuerKampf}                                       ${schadenDragon}
            HP:         ${hpHero}                   vs.                                 ${hpDragon}""".trimIndent()
            )
            println("")
            neueHpDragon = hpDragon - schadenWaffe1FuerKampf - schadenWaffe1FuerKampf
            neueHpHero = hpHero - schadenDragon
            println("")
            println(
                """
            |Neue Stats:                    HP:
            |${nameOfHero}      ->      ${neueHpHero}
            |${nameOfDragon}    ->      ${neueHpDragon}""".trimMargin()
            )

            rundenGespielt += 1
        }else if (gewaehlteWaffe == "3") {
            println("Du hast ${gewaehlteWaffe} gewählt!")
            println("Lass uns deine HP und Stärke deiner Waffe würfeln...")
            println("")
            println("HP: ${hpHero}")
            println("Schaden: ${schadenWaffe1FuerKampf}")
            println("")
            println("Nun bist du bereit gegen den Drachen zu kämpfen!")
            println("Der Kampf beginnt in...")
            println(
                """
                |3
                |2
                |1
                |GO!""".trimMargin()
            )
            println("")
            println(
                """
                        ${nameOfHero}                                                   ${nameOfDragon}
            Schaden:    ${schadenWaffe1FuerKampf}                                       ${schadenDragon}
            HP:         ${hpHero}                   vs.                                 ${hpDragon}""".trimIndent()
            )
            println("")
            neueHpDragon = hpDragon - schadenWaffe1FuerKampf - schadenWaffe1FuerKampf
            neueHpHero = hpHero - schadenDragon
            println("")
            println(
                """
            |Neue Stats:                    HP:
            |${nameOfHero}      ->      ${neueHpHero}
            |${nameOfDragon}    ->      ${neueHpDragon}""".trimMargin()
            )

            rundenGespielt += 1
        }
    }
    return
}