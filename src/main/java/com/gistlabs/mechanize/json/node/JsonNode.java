package com.gistlabs.mechanize.json.node;

import java.util.List;

import com.gistlabs.mechanize.document.node.Node;

/**
 * JSON Element abstraction, like the DOM for XML
 * 
 */
public interface JsonNode extends Node {

	public void setAttribute(String key, String value);
	public void setValue(String value);
	
	/**
	 * Find exactly one child with name, otherwise throw exception
	 * 
	 * @param name
	 * @return Either null, the one child node with name, or exception because of multiple
	 */
	public <T extends JsonNode> T getChild(String name);
	
	@Override
	public JsonNode getParent();
	
	@Override
	public List<? extends JsonNode> getChildren();
	
	@Override
	public List<? extends JsonNode> getChildren(String... names);
}