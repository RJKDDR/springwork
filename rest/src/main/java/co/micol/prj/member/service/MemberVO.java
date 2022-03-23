package co.micol.prj.member.service;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class MemberVO {
	
	private String id;
	@JsonIgnore
	private String password;
	private String name;
	private String tel;
	private String address;
	private String author;

}
