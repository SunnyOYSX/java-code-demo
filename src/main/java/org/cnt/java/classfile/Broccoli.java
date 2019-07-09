package org.cnt.java.classfile;

/**
 * <p>西兰花
 * @author lixinjie
 * @since 2019-07-09
 */
public class Broccoli extends Vegetable implements Organic {
	
	@Override
	public String getCertification() {
		return "china";
	}
	
	@Override
	public void grow() {
		System.out.println("grow");
	}

	public double bloom() {
		return 0.2;
	}
	
	public String fruit() {
		return "perfect";
	}
}