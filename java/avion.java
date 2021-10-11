abstract class Avion{
  private String marque, modele;
  private int immatriculation;

  public Avion (String marque, String modele, Fuselage fuselage, Reacteur reacteur ){
    this.marque = marque;
    this.modele = modele;
    fuzelage = new Fuzelage();
    reacteur = new Reacteur();
  }

  public String toString{
    return "avion de marque : " + marque + " et de modele : " + modele;
  }

  public int setimmat (Immatriculation i){
    return this.immatriculation = i ;
  }
}
