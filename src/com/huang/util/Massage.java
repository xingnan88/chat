package com.huang.util;

import java.util.List;

public class Massage
{
	private String name;
	private String content;
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getContent()
	{
		return content;
	}
	public void setContent(String content)
	{
		this.content = content;
	}
	public void add(List list)
	{
		 list.add(this.getName());
	     list.add(this.getContent());
	}
}
