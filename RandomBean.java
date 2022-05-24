package beans;

public class RandomBean {
private double nbr;

public double getNbr() {
	return nbr;
}

public void setNbr(double nbr) {
	this.nbr = nbr;
}
public RandomBean(){
	setNbr(0);
}
public double calculrandom(double nbr){
	return Math.random()*nbr;
	
}
}
