package org.cnt.java.classfile.bytecode.constantpool.util;

import org.cnt.java.classfile.bytecode.unsigned.U1;

/**
 * @author lixinjie
 * @since 2019-07-11
 */
public class ConstantEntryTag {
	
	private U1 u1;
	
	public ConstantEntryTag(byte[] bytes, int offset) {
		this.u1 = new U1(bytes, offset);
	}
	
	public int parse() {
		return u1.parse();
	}
	
	public int getTag() {
		return u1.getValue();
	}

	@Override
	public String toString() {
		return "ConstantEntryTag [getTag()=" + getTag() + "]";
	}
}