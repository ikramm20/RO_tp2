importilog . concerts .*;
importilog . cplex .*;

 application de classe publique  statique { 
static  public  main ( Chaîne [] args ) {
essayer {
IloCplex  cplex = nouveau  IloCplex ();
3
// initialiser les variables de décision, par exemple
Ilovar  xi = simplexe . var ( 0 , Double . MAX_VALUE );
//définition de la fonction objectif par exemple :
Ilofonct = simplexe . fonctExpr ();
simplexe . addMaximize ( objectif );
// La déclaration des contraintes
simplexe . addLe ( simplexe . somme ( x1 , x2 ), 70 );
simplexe . addLe ( simplexe . somme ( x1 , x2 ), 40 );
simplexe . addLe ( simplex . sum ( simplex . prod ( 3 , x1 ), x2 ), 90 );
//la résolution du problème
simplexe . résoudre ();
// L'affichage du résultat
si ( cplex . résoudre ()){
Système . dehors . println ( "La fonction objectif est de " +
complexe . getObjValeur ());
Système . dehors . println ( "la valeur de x est de : " + cplex . getValue ( x ));
Système . dehors . println ( "la valeur de y est de : " + cplex . getValue ( y ));
}
sinon {
Système . dehors . println ( "Le modèle n'a pas été résolu" );
}
} catch ( IloException  e ) {
Système . erreur . println ( "exception choisie : " + e );
}
}
}