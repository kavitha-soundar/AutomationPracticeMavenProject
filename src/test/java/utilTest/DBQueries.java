package utilTest;

public class DBQueries {
	
	public static String TopTenHorrorEnglishMovies ="select category.name as movie_category, film.title as Movie_name, language.name as Movie_Language from category join film_category on category.category_id=film_category.category_id join film \r\n"
			+ "on film_category.film_id=film.film_id join language on film.language_id= language.language_id\r\n"
			+ "where category.name='Horror' \r\n"
			+ "order by film.title asc limit 10;";
	

}
