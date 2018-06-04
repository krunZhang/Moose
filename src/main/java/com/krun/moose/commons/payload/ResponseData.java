/*
 * Copyright © 2018 krun, All Rights Reserved.
 * Project: moose
 * File:      ResponseData.java
 * Date:    18-6-4 下午6:08
 * Author: krun
 */

package com.krun.moose.commons.payload;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

/**
 * ResponseData.java
 *
 * @author krun
 * @date 2018/6/4 16:50
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseData <E> {

	private int    code;
	private String message;
	private E      data;

	public static <E> ResponseDataBuilder<E> ok () {
		return create(HttpStatus.OK);
	}

	public static <E> ResponseDataBuilder<E> ok (String message) {
		return create(HttpStatus.OK, message);
	}

	public static <E> ResponseDataBuilder<E> unauthorized () {
		return create(HttpStatus.UNAUTHORIZED);
	}

	public static <E> ResponseDataBuilder<E> unauthorized (String message) {
		return create(HttpStatus.UNAUTHORIZED, message);
	}

	public static <E> ResponseDataBuilder<E> badRequest () {
		return create(HttpStatus.BAD_REQUEST);
	}

	public static <E> ResponseDataBuilder<E> badRequest (String message) {
		return create(HttpStatus.BAD_REQUEST, message);
	}

	private static <E> ResponseDataBuilder<E> create (HttpStatus status) {
		return create(status, status.getReasonPhrase());
	}

	private static <E> ResponseDataBuilder<E> create (HttpStatus status, String message) {
		return ResponseData.<E>builder().code(status.value())
		                                .message(message);
	}

}
