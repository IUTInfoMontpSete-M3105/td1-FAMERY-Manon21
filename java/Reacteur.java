class Reacteur {
  private int poid;
  private int pousse;
  private String marque;

  public Fuzelage(int poid, int capacite, String marque){
    this.poid = poid;
    this.capacite = capacite;
    this.marque = marque;
  }

  String toString(){
    return "fuzelage";
  }
}
