class UsineBoeing extends Usine{

  public UsineBoeing (String ville){
    super.ville = ville;
  }

  String toString (){
    return "boeing";
  }

  public Avion FabriqueAvion(String modeleAvion, String marqueReacteur){
    Boeing monAvion = new Avion (modeleAvion, marqueReacteur);
    return monAvion;
  }

}
