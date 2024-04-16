package com.ibm.repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ibm.model.MoviesModel;

@Repository
public class MoviesRepository {
	
	@Autowired
	private JdbcTemplate jdbc;

	public JdbcTemplate getJdbc() {
		return jdbc;
	}

	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}
	
	
	public void save(MoviesModel m)
	{
		String sql="insert into movies values(?,?,?)";
		int data=jdbc.update(sql,m.getMovieid(),m.getTitle(),m.getGenres());
		System.out.println(data+"Records inserted");
	}

	public List<MoviesModel> getAll() {
		String sql="select * from movies";
	
		RowMapper<MoviesModel> mapper=new RowMapper<MoviesModel>()
				{

					@Override
					public MoviesModel mapRow(ResultSet rs, int rowNum) throws SQLException {
					    MoviesModel m=new MoviesModel();
					    m.setMovieid(rs.getInt("movieid"));
					    m.setTitle(rs.getString("title"));
					    m.setGenres(rs.getString("genres"));
						return m;
					    
					}
			
				};
				return jdbc.query(sql, mapper);
		
	}

}
