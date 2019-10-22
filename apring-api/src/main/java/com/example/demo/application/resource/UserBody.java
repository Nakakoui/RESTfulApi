package com.example.demo.application.resource;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.example.demo.domain.object.User;

import lombok.Data;

@Data
public class UserBody {
	@NotBlank
	@Size(max = 18)
	private String id;
	
	@NotBlank
	private String value;
	
	/**
	 * �h���C���I�u�W�F�N�g�֕ϊ�
	 *
	 * @return �h���C���I�u�W�F�N�g
	 */
	public User toDomainUser() {
		return User.builder().id(this.id).value(this.value).build();
	}
}
