abstract class Usine{
  private String ville;

  public Usine (String ville, String constructeur){
    this.ville = ville;
    constructeur = null;
  }

  String toString(){
    return "usine";
  }

  public abstract Avion FabriqueAvion(String modeleAvion, String marqueReacteur);
}
