public class Animal implements SerVivo{
   public boolean vivo = true;


   @Override
   public void mover() {


   }
   @Override
   public void comer() {


   }
   @Override
   public void info() {
       System.out.printf("Vivo: %s %n", this.vivo ? "SIM" : "NAO");
   }
}
