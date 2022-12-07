# JunitTestCinema
Excercises for Unittesting


Praxis


Für die Übung importieren Sie bitte die Cinema.zip Datei vom Netzlaufwerk als neues Projekt in Eclipse. 
Bei diesem Projekt handelt es sich um eine Verwaltungssoftware für Kinos. 
In diesem Projekt existiert ein  „Source  Folder“  namens  „test“.  
Dieser  enthält das  Package  „de.techstarter.cinema.test“.  
Dort erstellen Sie bitte Ihre Testklassen mit den zu implementierenden Testfällen. 

1.Machen Sie sich mit dem Projekt vertraut.

2.Als   Erstes   sollen   Sie   die   Ticket   Klasse   testen.   
Dazu   erstellen   sie   im   Package „de.techstarter.cinema.test“  die  Klasse  TicketTest.  
Schreiben  Sie  eine  Test-Methode,  die überprüft ob die Getter-Methoden die erwarteten Werte zurückliefern. 
Da die Klasse Ticket keine Setter-Methoden anbietet müssen diese nicht getestet werden.

3.Als Zweites testen Sie die CinemaAuditorium Klasse. 
Gehen Sie dazu genauso vor wie beim Testen des Tickets. 
Des Weiteren soll getestet werden,wie sich die equals-Methode verhält, wenn zwei gleiche Vorstellungssäle  
und  zwei  unterschiedliche  Vorstellungssäle  verglichen werden.  
Die  checkPlace-Methode  ist  package  protected  und  muss  daher  nicht  getestet werden.

4.Nun  testen Sie,ob  die  Show  Klasse  sich  so  verhält,  wie  wir  es  erwarten.  
Gehen  Sie  dazu genauso vor wie bei den vorherigen Tests.

5.Sie  haben  nun  alle  Klassen,  mit  denen  CinemaManagement  interagiert,  getestet.  

Jedoch werden  wir  uns  erst  in  den  nächsten  Aufgaben  damit  beschäftigen  CinemaManagement  zu testen.

6.Zusatz: Überlegen Sie sich weitere Testfälle.
