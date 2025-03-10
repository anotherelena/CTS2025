// Source code is decompiled from a .class file using FernFlower decompiler.
public class PachetCazareTransport implements PachetTuristic {
   private String tipCazare;
   private String tipTransport;

   public PachetCazareTransport(String var1, String var2) {
      this.tipCazare = var1;
      this.tipTransport = var2;
   }

   public String descriere() {
      return "Pachet complet: Cazare la " + this.tipCazare + " si transport prin " + this.tipTransport;
   }
}
