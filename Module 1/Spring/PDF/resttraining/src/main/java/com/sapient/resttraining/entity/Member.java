/**
 * 
 */
package com.sapient.resttraining.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Columns;

/**
 * @author admi
 *
 */
@Entity
public class Member {

		@Id
		private int id;
		private String memberName;
		/**
		 * @return the id
		 */
		public int getId() {
			return id;
		}
		/**
		 * @param id the id to set
		 */
		public void setId(int id) {
			this.id = id;
		}
		/**
		 * @return the memberName
		 */
		public String getMemberName() {
			return memberName;
		}
		/**
		 * @param memberName the memberName to set
		 */
		public void setMemberName(String memberName) {
			this.memberName = memberName;
		}
}
