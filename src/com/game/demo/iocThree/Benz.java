package com.game.demo.iocThree;

import org.springframework.stereotype.Service;

@Service
public class Benz implements Car
{

	@Override
	public String getCarName()
	{

		return "I am Benz GLK";

	}

}
