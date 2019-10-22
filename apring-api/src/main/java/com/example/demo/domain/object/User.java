package com.example.demo.domain.object;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
	/**
	 * ユーザID
	 */
	private String id;
	
	/**
	 * ユーザ情報
	 */
	private String value;
}
