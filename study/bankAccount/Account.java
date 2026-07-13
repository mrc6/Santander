public class Account{
  private double saldo = 0;
  private double chequeEspecial = 0;
  
  public Account(double deposit){
      if (deposit <= 500.00) {
          this.chequeEspecial = 50.00;
      } else {
          this.chequeEspecial = 0.5 * deposit;  
      }
      this.saldo = deposit + chequeEspecial;
  }
  
  
  public double getSaldo() {
      return this.saldo;
  }
  
  public double getChequeEspecial() {
      return this.chequeEspecial;
  }
  
  public void deposit(double amount){
      this.saldo += amount;
  }
  
  public void withdraw(double amount){
      if (amount <= saldo){
          this.saldo -= amount;
      } else {
          System.out.println("Saldo insuficiente");  
      }
  }
  
  public void payBill(double bill){
      if (bill <= saldo){
          this.saldo -= bill;
      } else {
          System.out.println("Saldo insuficiente");  
      }
  }
  
  public boolean isChequeEspecialInUse(){
      return this.saldo < this.chequeEspecial;  
  }

}
