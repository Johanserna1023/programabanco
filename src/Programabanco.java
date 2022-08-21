
import static java.awt.PageAttributes.MediaType.C1;


public class Programabanco {
    
    // Programa Bnco Por Consola
   
    public static void main(String[] args) {
      Cuenta c1 = new Cuenta("ALFA2321");
        Cuenta c2 = new Cuenta(150,"BETA2731"); 
        C1.deposito(-50);
        
        class Banco{
        private double Interes = 0.5;
        private double impuestoTrans = 10;
        private Usuario [] usurios;
           public void calcularInteres(){
           }
           public Banco(){
           }
           public void getimpuestoTrans(){
           }
                
                
        }
        class Cuenta{
          private double  balance = 100;
          private String numeroCuenta;
          
           public void deposito(double deposito){
               if(deposito>0){
               balance += deposito;
               System.out.println(deposito + "$ han sido despositados a su cuenta satisfactoriamente." + "Su nuevo balance en su cuenta es" +   balance);
               
               
               }else{
                    System.err.println("Porfavor deposite un informe positivo");
                   
               }
           }

            public Cuenta(String numeroCuenta) {
                this.numeroCuenta = numeroCuenta;
            }
            
            
              public Cuenta(double balance,String  numeroCuenta) {
                this.numeroCuenta = numeroCuenta;
                if(balance>=100){
                   this.balance = balance;
                }else{
                   balance = 100;
                }
            }
              
              
              
           public void retiro(){
           }
           public void getBalance(){
           }
          
        
        }
        
        class usuario{
        String nmobre;
        Cuenta cuenta;
        public void mostrar(){
        }
        public void getNombre(){
        }
        
        public void getCuenta(){
        }
        }
     
        
    }
        
    
}
