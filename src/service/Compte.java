package service;

import java.util.Date;

public class Compte {
 private int code ;
 private double solde ;
 private Date datecreat;
public Compte(int code, double solde, Date datecreat) {
	
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
 public Date getDatecreat() {
	return datecreat;
 }
 public void setDatecreat(Date datecreat) {
	this.datecreat = datecreat;
 }}
