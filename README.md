# fffm-java-23-1-Enum-Optional

### Erstellt ein neues Projekt in IntelliJ und implementiert die folgenden Schritte.

Schritt 1: Erstelle ein Enum DaysOfWeek mit den Wochentagen (Montag bis Sonntag).

Schritt 2: Schreibe eine Methode, die den übergebenen Wochentag als String zurückgibt, wenn er ein Werktag (Montag bis Freitag) ist, andernfalls gib 'Wochenende' zurück.

Schritt 3: Erstelle ein Record 'Person' mit den Eigenschaften 'id', 'name' und 'favoriteDay', wobei 'favoriteDay' vom Typ DaysOfWeek ist.

Schritt 4: Erstelle eine Klasse PersonRepository mit einer Liste/Map von Personen.

Schritt 5: Schreibe eine Methode in der Klasse PersonRepository, die eine Person anhand ihrer Id aus der Liste/Map sucht und zurückgibt. Die Methode soll ein Optional zurückgeben.

Schritt 6: überprüft in euerer Main-Methode, ob es die Person gibt. Wenn es sie gibt, dann gib den Namen und den Lieblings-Wochentag auf der Konsole aus.

### Falls ihr diese Aufgabe bereits früher abgeschlossen habt, dürft ihr die Bonusaufgabe auf der nächsten Seite bearbeiten.

Erweitere den Record Person um ein Enum Gender (Männlich, Weiblich, Divers).

Schreibe eine Methode im PersonRepository, die die Anzahl der Personen nach Geschlecht zählt und die Ergebnisse ausgibt.

Füge eine Methode im PersonRepository hinzu, die eine Person anhand ihres Namens sucht und zurückgibt. Die Methode soll ein Optional zurückgeben.

Schreibe eine Methode im PersonRepository, die alle Personen anhand ihres Lieblings-Wochentags sucht und zurückgibt. Die Methode solle Liste zurückgeben.
