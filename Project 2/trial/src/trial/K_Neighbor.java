package trial;


public class K_Neighbor {
	private int user_id;
	private double similarity;
	private int rating;
public K_Neighbor(){}
public K_Neighbor(int user_id, double similarity,int rating){
	this.user_id=user_id;
	this.similarity=similarity;	
	this.rating=rating;
}
public K_Neighbor(int user_id, double similarity){
	this.user_id=user_id;
	this.similarity=similarity;	
	
}
public double get_similarity(){
	return similarity;
}
public int get_user_id(){
	return user_id;
}
public int get_rating(){
	return rating;
}
	
public void set_similarity(double sim1){
	this.similarity=sim1;	
}
public void set_user_id(int u1){
	this.user_id=u1;
}
public void set_rating(int rating){
	this.rating=rating;
}
}
