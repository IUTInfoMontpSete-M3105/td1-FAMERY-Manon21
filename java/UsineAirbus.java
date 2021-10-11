class UsineAirbus extends Usine{

  public UsineAirbus (String ville){
    super.ville = ville;
  }

  String toString (){
    return "airbus";
  }

  public Avion FabriqueAvion(String modeleAvion, String marqueReacteur){
    Avion monAvion = new Airbus (modeleAvion, marqueReacteur);
    return monAvion;
  }

  public abstract Satellite FabriqueSatellite(String modeleSatellite){
    Satellite monSatellite = new SatelliteTerrestre (modeleSatellite);
    return monSatellite;
  }
}
