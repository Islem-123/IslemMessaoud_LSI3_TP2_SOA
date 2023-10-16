package service;

public class Compte {
 private int code ;
 private double solde ;
 private String datecreat;
public Compte(int code, double solde, String datecreat) {
	
	this.code = code;
	this.solde = solde;
	this.datecreat = datecreat;
 }
 public int getCode() {
	return code;
 }
 public void setCode(int code) {
	this.code = code;
 }
 public double getSolde() {
	return solde;
 }
 public void setSolde(double solde) {
	this.solde = solde;
 }
 public String getDatecreat() {
	return datecreat;
 }
 public void setDatecreat(String datecreat) {
	this.datecreat = datecreat;
 }
 
 
 
 
 
 
 
 
}
