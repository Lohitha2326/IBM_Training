package com.ibm.repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ibm.model.MoviesModel;
import com.ibm.model.RatingsModel;
@Repository
public class RatingsRepository {

	@Autowired
	
	private JdbcTemplate jdbc;
	
	public JdbcTemplate getJdbc() {
		return jdbc;
	}

	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}
	

	public void saveRatings(RatingsModel m)
	{
		String sql="insert into movies values(?,?,?,?)";
		int data=jdbc.update(sql,m.getUserid(),m.getMovieid(),m.getRating(),m.getTstamp());
		System.out.println(data+"Records inserted");
	}

	public List<RatingsModel>getAll() {
		
		String sql="select * from movies";
		
		RowMapper<RatingsModel> mapper=new RowMapper<RatingsModel>()
				{

					@Override
					public RatingsModel mapRow(ResultSet rs, int rowNum) throws SQLException {
					    RatingsModel r=new RatingsModel();
					    r.setUserid(rs.getInt("userid"));
					    r.setMovieid(rs.getInt("movieid"));
					    r.setRating(rs.getInt("rating"));
					    r.setTstamp(rs.getString("tstamp"));
						return r;
					    
					}
			
				};
				return jdbc.query(sql, mapper);
		 
		
	
		
		
	}

}
