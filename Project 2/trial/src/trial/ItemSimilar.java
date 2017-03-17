package trial;

public class ItemSimilar {
	private int userid;
	private int movieid;
public ItemSimilar(){}
public ItemSimilar(int userid,int movieid){
	this.userid=userid;
	this.movieid=movieid;
}
public void setUserId(){
	this.userid=userid;
}
public void setMovieId(){
	this.movieid=movieid;
}
public int getUserId(){
	return userid;
}
public int getMovieId(){
	return movieid;
}
}
