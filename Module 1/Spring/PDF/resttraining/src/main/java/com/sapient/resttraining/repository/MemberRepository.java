/**
 * 
 */
package com.sapient.resttraining.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sapient.resttraining.entity.Member;

/**
 * @author admi
 *
 */
public interface MemberRepository extends JpaRepository<Member, Integer> {
	/**
	@Query("select u from Member u where u.membername = ?1")
	  Member findByMemberId(String emailAddress);
	**/
	/**
	@Query("select u from User u where u.emailAddress = ?1")
	  User findByEmailAddress(String emailAddress);
**/
}
