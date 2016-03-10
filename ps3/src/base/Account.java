package base;

import java.util.Date;


public class Account {

private int id=0;
private double balance=0;
private double annualIntrestRate=0;
private Date dateCreated;
public Account(){
	dateCreated= new Date();
}
public Account(int id, double balance) {
	this();
	this.id = id;
	this.balance = balance;

}
public double getMonthltIntrestRate(){
	return (annualIntrestRate/2);
}
public void withdraw(double amount) throws
InsufficientFunds
{
if((amount - balance)>=0)
{
balance -= amount;
}
else
{
double debt = amount - balance;
throw new InsufficientFunds(debt);
}
}

public double depoist(double amount){
	return(balance+=amount);
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public double getAnnualIntrestRate() {
	return annualIntrestRate;
}
public void setAnnualIntrestRate(double annualIntrestRate) {
	this.annualIntrestRate = annualIntrestRate;
}
public Date getDateCreated() {
	return dateCreated;
}
public void setDateCreated(Date dateCreated) {
	this.dateCreated = dateCreated;
}

}
