# TEST-LAANANI-RAMI-16-04-2021
TEST LAALANI RAMI 16-04-2021
                                                    

Problématique :
Développer 
Un com.bnp.controller.service Web Rest qui sera une façade pour deux sous services (service1, service2) :

1.	 Service 1 : Un com.bnp.controller.service qui permet d'accepter une liste de structure de données appelée Person telle que définie ci-dessous, avec un paramètre du type entier subListSize :

    a.	Les objets Person sont considérés valides en fonction des critères suivants : 

       i.	LastName  : obligatoire et différent de vide.
       ii.	FirstName : obligatoire et différent de vide. 
       
    b.	 Les objets de type Personne ayant fait l'objet d'un filtrage doivent être clairement affichés dans les logs en cas d’investigation.

    c.	Le com.bnp.controller.service doit pouvoir diviser (Split) la liste des Person en une seule liste de sous-listes dont la taille de chacune des sous-listes est égale au maximum à subListSize.

2.	 Service 2: Filtrer et Sauvegarder tous les objets Person reçus dans une table (DB H2 par exemple) en suivant les étapes suivantes :

  a.	Filtrer la liste des Person lorsque Age > 40.
  
  b.	Sauvegarder la liste dans la table.
  
  c.	La liste filtrée doit apparaître dans un fichier texte avec un chemin paramétrable.  
  
      i.	On doit trier la liste avant qu'elle ne soit écrite en se basant sur le triplet suivant :
      
                          (Age --> LastName --> FirstName)
 d. Bonus : Pour les trois sous traitements ci-dessus (a, b et c) : On doit avoir la possibilité de définir l’ordre des sous-traitements et la combinaison qui va 
composer le com.bnp.controller.service 2 :

       Exemple : lancer (a, c) ou (c, a), ou (c, b) ou (b, c, a) …

3.	Un ensemble de tests unitaires pour tester le com.bnp.controller.service développé.
4.	Les deux services 1 et 2 doivent être déclenchés via un job SpringBatch (à mettre en place).

  Exemple du body de la requête : 
    {

     "Persons": [
        {
          "FirstName": "P1",
          "LastName": "P2",
          "Age": 10
        },
        {
          "FirstName": "P1",
          "LastName": "P2",
          "Age": 10
        }
      ],
      "SubListSize": 2
      }
