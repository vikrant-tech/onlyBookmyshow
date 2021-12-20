package bookmyshow.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import bookmyshow.Models.Movie;

@Repository
public class MovieDao {
	
	@Autowired
    private HibernateTemplate hibernateTemplate; 
	
	@Transactional
	public int saveMovie(Movie movie) {
		
		int id =(Integer) this.hibernateTemplate.save(movie);
		return id;
	}


}
