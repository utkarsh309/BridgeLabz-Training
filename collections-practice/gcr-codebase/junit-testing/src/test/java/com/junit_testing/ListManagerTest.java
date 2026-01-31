package com.junit_testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.util.List;
import java.util.ArrayList;

public class ListManagerTest {

	private ListManager listManager;
	private List<Integer>list;
	
	@BeforeEach
	void setUp() {
		listManager=new ListManager();
		list=new ArrayList<>();
	}
	
	@Test
	void addElementTest() {
		listManager.addElement(list, 10);
		listManager.addElement(list, 20);
		
		assertTrue(list.contains(10));
		assertTrue(list.contains(20));
		assertEquals(2,listManager.getSize(list));
	}
	
	@Test
	void removeElementTest() {
		listManager.addElement(list, 10);
		listManager.addElement(list, 20);
		
		listManager.removeElement(list, 10);
		assertFalse(list.contains(10));
		assertEquals(1,listManager.getSize(list));
	}
	
	@Test
	void getSizeTest() {
		listManager.addElement(list, 10);
		listManager.addElement(list, 20);
		
		assertEquals(2,listManager.getSize(list));
	}
	
}
