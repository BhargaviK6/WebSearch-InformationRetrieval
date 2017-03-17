package trial;

import java.util.ArrayList;

public class UMR_List {
	private ArrayList user_list=null;
	private ArrayList movie_list=null;
	private ArrayList rating_list=null;
	public UMR_List(){

	}
	public UMR_List(ArrayList user_list,ArrayList movie_list,ArrayList rating_list){
		this.user_list=user_list;
		this.movie_list=movie_list;
		this.rating_list=rating_list;
	}
	public ArrayList get_user_list(){
		return user_list;
	}
	public ArrayList get_movie_list(){
		return movie_list;
	}
	public ArrayList get_rating_list(){
		return rating_list;
	}
	public void set_user_list(ArrayList user_list){
		this.user_list=user_list;

	}
	public void set_movie_list(ArrayList movie_list){

		this.movie_list=movie_list;

	}
	public void set_rating_list(ArrayList rating_list){
		this.rating_list=rating_list;
	}
}
