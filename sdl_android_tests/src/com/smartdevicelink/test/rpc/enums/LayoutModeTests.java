package com.smartdevicelink.test.rpc.enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import junit.framework.TestCase;

import com.smartdevicelink.proxy.rpc.enums.LayoutMode;

public class LayoutModeTests extends TestCase {

	public void testValidEnums () {	
		String example = "ICON_ONLY";
		LayoutMode enumIconOnly = LayoutMode.valueForString(example);
		example = "ICON_WITH_SEARCH";
		LayoutMode enumIconWithSearch = LayoutMode.valueForString(example);
		example = "LIST_ONLY";
		LayoutMode enumListOnly = LayoutMode.valueForString(example);
		example = "LIST_WITH_SEARCH";
		LayoutMode enumListWithSearch = LayoutMode.valueForString(example);
		example = "KEYBOARD";
		LayoutMode enumKeyboard = LayoutMode.valueForString(example);
		
		assertNotNull("ICON_ONLY returned null", enumIconOnly);
		assertNotNull("ICON_WITH_SEARCH returned null", enumIconWithSearch);
		assertNotNull("LIST_ONLY returned null", enumListOnly);
		assertNotNull("LIST_WITH_SEARCH returned null", enumListWithSearch);
		assertNotNull("KEYBOARD returned null", enumKeyboard);
	}
	
	public void testInvalidEnum () {
		String example = "icOn_OnlY";
		try {
		    LayoutMode temp = LayoutMode.valueForString(example);
            assertNull("Result of valueForString should be null.", temp);
		}
		catch (IllegalArgumentException exception) {
            fail("Invalid enum throws IllegalArgumentException.");
		}
	}
	
	public void testNullEnum () {
		String example = null;
		try {
		    LayoutMode temp = LayoutMode.valueForString(example);
            assertNull("Result of valueForString should be null.", temp);
		}
		catch (NullPointerException exception) {
            fail("Null string throws NullPointerException.");
		}
	}	
	
	public void testListEnum() {
 		List<LayoutMode> enumValueList = Arrays.asList(LayoutMode.values());

		List<LayoutMode> enumTestList = new ArrayList<LayoutMode>();
		enumTestList.add(LayoutMode.ICON_ONLY);
		enumTestList.add(LayoutMode.ICON_WITH_SEARCH);
		enumTestList.add(LayoutMode.LIST_ONLY);
		enumTestList.add(LayoutMode.LIST_WITH_SEARCH);
		enumTestList.add(LayoutMode.KEYBOARD);

		assertTrue("Enum value list does not match enum class list", 
				enumValueList.containsAll(enumTestList) && enumTestList.containsAll(enumValueList));
	}
	
}
