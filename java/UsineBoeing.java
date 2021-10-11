class UsineBoeing extends Usine{

  public UsineBoeing (String ville){
    super.ville = ville;
  }

  String toString (){
    return "boeing";
  }

  public Avion FabriqueAvion(String modeleAvion, String marqueReacteur){
    Avion monAvion = new Boeing (modeleAvion, marqueReacteur);
    return monAvion;
  }

  public abstract Satellite FabriqueSatellite(String modeleSatellite){
    Satellite monSatellite = new SatelliteTerrestre (modeleSatellite);
    return monSatellite;
  }

}
