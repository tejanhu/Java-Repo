import java.util.ArrayList;

class DrinksMachineB
{
 protected ArrayList<Can> cokes, fantas;
 protected int price,balance,cash;

 public DrinksMachineB(int p)
 {
  price = p;
  balance = 0;
  cash = 0;
  cokes = new ArrayList<Can>();
  fantas = new ArrayList<Can>();
 }

 public DrinksMachineB(int p,int c, int f)
 {
  this(p);
  for(int i=0; i<c; i++)
     loadCoke(new Can("coke"));
  for(int i=0; i<f; i++)
     loadFanta(new Can("fanta"));
 }

 public void insert(int n)
 {
  balance=balance+n;
 }

 public int getBalance()
 {
  return balance;
 }

 public int collectCash()
 {
  int oldCash = cash;
  cash = 0;
  return oldCash;
 }

 public int getPrice()
 {
  return price;
 }

 public int pressChange()
 {
  int change=balance;
  balance=0;
  return change;
 }

 public Can pressCoke() throws EmptyMachineException,NotEnoughMoneyException
 {
  if(cokes.size()>0&&balance>=price)
     {
      Can can = cokes.get(0);
      cokes.remove(0);
      balance=balance-price;
      cash=cash+price;
      return can;
     }
  else if(balance>=price)
     throw new EmptyMachineException("coke");
  else
     throw new NotEnoughMoneyException(""+(price-balance));
 }

 public Can pressFanta() throws EmptyMachineException,NotEnoughMoneyException
 {
  if(fantas.size()>0&&balance>=price)
     {
      Can can = fantas.get(0);
      fantas.remove(0);
      balance=balance-price;
      cash=cash+price;
      return can;
     }
  else f(balance>=price)
     throw new EmptyMachineException("coke");
  else
     throw new NotEnoughMoneyException(""+(price-balance));

 }

 public void loadCoke(Can can)
 {
  cokes.add(can);
 }
 
 public void loadFanta(Can can)
 {
  fantas.add(can);
 }

 public boolean cokesEmpty()
 {
  return cokes.size()==0;
 }

 public boolean fantasEmpty()
 {
  return fantas.size()==0;
 }

 public void setPrice(int p)
 {
  price = p;
 }
}
