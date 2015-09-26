
package com.aysidisi.dungeonlordsandraiders.dungeon.model;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class DungeonField
{
	private Integer fieldTypeId;

	@Id
	private ObjectId id;

	private Integer positionX;
	
	private Integer positionY;
	
	private List<ObjectId> raiderIds;
	
	public Integer getFieldTypeId()
	{
		return this.fieldTypeId;
	}

	public ObjectId getId()
	{
		return this.id;
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
	
	public void setFieldTypeId(final Integer fieldTypeId)
	{
		this.fieldTypeId = fieldTypeId;
	}
	
	public void setId(final ObjectId id)
	{
		this.id = id;
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
	
}
