class Immatriculation{
  private Immatriculation instance;

  private Immatriculation(Immatriculation instance){
    this.instance = instance;
  }

  String toString(){
    return "immatriculation";
  }

  public Immatriculation getImmat(){

    if (insatance == null){
      instance = new Immatriculation();
    }
    return insatance;
  }

  public Avion ajouterAvion (Avion a){

  }
}
