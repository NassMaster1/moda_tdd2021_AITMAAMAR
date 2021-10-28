#Qst1:A quoi servent ces librairies JUnit, Hamcrest et Mockito. ?
reponse 1: 
c'est des frameworks pour ecrire des tests unitaires dans le language de programmation 
Java.
ils permettent  de vérifier le bon fonctionnement
d'une petite partie bien précise (unité ou module) d'une application. Ils s'assurent qu'une 
méthode exposée à la manipulation par un utilisateur fonctionne bien de la façon dont elle a été conçue.

#QST 5: Quelle duplication existe pour l’instant dans notre code ,
réponse 5:
la duplication c'est dans la méthode getName(), elle renvoie que Example 
donc pour d'autre name il faut crée à chaque fois une autre méthode 
pour renvoyer un autre  nom que "Example"
Solution:   
public String getName() {
return this.Name;
}

Triangulation
QST1: Est-il possible de faire un test qui n’implique l’ajout que d’une seule de ces deux méthodes ?
non c'est pas possible car c'est pas le meme comportement des deux méthodes.

Traductions multiples
Que proposez-vous pour pouvoir gérer les traductions multiples ?
on utilise une hashMap<String,List> pour pouvoir gerer la traduction 
mulp; La list à l'intérieur de hashMap pour sotocker les mots multiples 



