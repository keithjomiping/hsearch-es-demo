/*
 * Hibernate Search, full-text search for your domain model
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.demos.hswithes.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Character {

	@Id
	@GeneratedValue
	@JsonIgnore
	public long id;

	public String nickName;

	public String specialPower;

	@ManyToMany(mappedBy="characters")
	@JsonIgnore
	public List<VideoGame> appearsIn = new ArrayList<>();

	Character() {
	}

	public Character(String nickName, String specialPower) {
		this.nickName = nickName;
		this.specialPower = specialPower;
	}

	@Override
	public String toString() {
		return "Character [id=" + id + ", nickName=" + nickName + ", specialPower=" + specialPower + "]";
	}
}
