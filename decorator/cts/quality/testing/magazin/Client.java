package cts.quality.testing.magazin;

public class Client {
   private String nume;
   private boolean discountUtilizat;

   public Client(String var1) {
      this.nume = var1;
      this.discountUtilizat = false;
   }

   public String getNume() {
      return this.nume;
   }

   public boolean isDiscountUtilizat() {
      return this.discountUtilizat;
   }

   public void setDiscountUtilizat(boolean var1) {
      this.discountUtilizat = var1;
   }
}
