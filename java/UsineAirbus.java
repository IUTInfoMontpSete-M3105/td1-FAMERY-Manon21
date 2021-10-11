class UsineAirbus extends Usine{

  public UsineAirbus (String ville){
    super.ville = ville;
  }

  String toString (){
    return "airbus";
  }

  public Avion FabriqueAvion(String modeleAvion, String marqueReacteur){
    Airbus monAvion = new Avion (modeleAvion, marqueReacteur);
    return monAvion;
  }
}
