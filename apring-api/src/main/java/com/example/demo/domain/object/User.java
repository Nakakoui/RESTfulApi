package com.example.demo.domain.object;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
	/**
	 * ���[�UID
	 */
	private String id;
	
	/**
	 * ���[�U���
	 */
	private String value;
}
