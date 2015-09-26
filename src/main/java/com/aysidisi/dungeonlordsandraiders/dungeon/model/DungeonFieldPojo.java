
package com.aysidisi.dungeonlordsandraiders.dungeon.model;

import java.util.List;

import org.bson.types.ObjectId;

public class DungeonFieldPojo
{
	private Integer fieldTypeId;
	
	private Integer positionX;
	
	private Integer positionY;
	
	private List<ObjectId> raiderIds;
	
	private Integer relativePositionX;
	
	private Integer relativePositionY;
	
	public Integer getFieldTypeId()
	{
		return this.fieldTypeId;
	}
	
	public Integer getPositionX()
	{
		return this.positionX;
	}

	public Integer getPositionY()
	{
		return this.positionY;
	}

	public List<ObjectId> getRaiderIds()
	{
		return this.raiderIds;
	}

	public Integer getRelativePositionX()
	{
		return this.relativePositionX;
	}

	public Integer getRelativePositionY()
	{
		return this.relativePositionY;
	}

	public void setFieldTypeId(final Integer fieldTypeId)
	{
		this.fieldTypeId = fieldTypeId;
	}

	public void setPositionX(final Integer positionX)
	{
		this.positionX = positionX;
	}

	public void setPositionY(final Integer positionY)
	{
		this.positionY = positionY;
	}

	public void setRaiderIds(final List<ObjectId> raiderIds)
	{
		this.raiderIds = raiderIds;
	}

	public void setRelativePositionX(final Integer relativePositionX)
	{
		this.relativePositionX = relativePositionX;
	}

	public void setRelativePositionY(final Integer relativePositionY)
	{
		this.relativePositionY = relativePositionY;
	}
}
