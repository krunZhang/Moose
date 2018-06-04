/*
 * Copyright © 2018 krun, All Rights Reserved.
 * Project: moose
 * File:      MoosePage.java
 * Date:    18-6-4 下午6:07
 * Author: krun
 */

package com.krun.moose.payload.response;

import lombok.Data;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * MoosePage.java
 *
 * @author krun
 * @date 2018/6/4 17:55
 */
@Data
public class MoosePage {

	private List content;
	private int  page;
	private int  totalPage;
	private long totalElements;

	private MoosePage (Page page) {
		this.content = page.getContent();
		this.page = page.getPageable()
		                .getPageNumber();
		this.totalElements = page.getTotalElements();
		this.totalPage = page.getTotalPages();
	}

	public static MoosePage slim (Page page) {
		return new MoosePage(page);
	}
}
