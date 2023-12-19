package com.example.demo.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.annotations.SQLDelete;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.GroundsDetails;

@Repository
public interface GroundRepository extends JpaRepository<GroundsDetails, Integer> {

	public GroundsDetails findByGroundid(String ground_id);
	public List<GroundsDetails> findByOwnerid(int owner_id);
	
	//@Transactional
	@Modifying
	//@Query("delete from User where ground_id = :ground_id")

	//public void deleteById(String id);
	 String deleteByGroundid(String ground_id);
}
