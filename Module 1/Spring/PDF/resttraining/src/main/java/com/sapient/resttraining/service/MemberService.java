/**
 * 
 */
package com.sapient.resttraining.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapient.resttraining.entity.Member;
import com.sapient.resttraining.repository.MemberRepository;

/**
 * @author admi
 *
 */
@Service
public class MemberService {
	
	@Autowired
	private MemberRepository memberrepository;

	public List<Member> findAllMembers() {
		// TODO Auto-generated method stub
		
		return null;
	}

	public Member saveNewMember(Member newMember) {
		// TODO Auto-generated method stub
		Member member = memberrepository.save(newMember);
		return newMember;
	}

	public Optional<Member> getMembersById(Integer id) {
		// TODO Auto-generated method stub
		Optional<Member> member =memberrepository.findById(id);
		return member;
	}
	
	
}
