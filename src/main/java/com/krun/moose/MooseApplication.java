/*
 * Copyright © 2018 krun, All Rights Reserved.
 * Project: moose
 * File:      MooseApplication.java
 * Date:    18-6-4 上午11:03
 * Author: krun
 */

package com.krun.moose;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * MooseApplication.java
 *
 * @author krun
 * @date 2018/6/4 10:47
 */
@SpringBootApplication
public class MooseApplication {

	public static void main (String[] args) {
		SpringApplication.run(MooseApplication.class, args);
	}
}
