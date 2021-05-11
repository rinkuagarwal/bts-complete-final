package com.ibm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



public class BugServiceTest {

	@Test
	public void testCreateBug() {
		BugService bugService = new BugService();
		BugRepository dummyRepo = new DummyBugRepository();
		bugService.setBugRepository(dummyRepo);
		Bug bug = new Bug();
		String bugId = bugService.createBug(bug);
		assertNotNull(bugId);

	}
	@Test
	void testGetBugs() {
		BugService bugService = new BugService();
		BugRepository dummyRepo = new DummyBugRepository();
		bugService.setBugRepository(dummyRepo);
		Bug bug = new Bug();
		String bugId = bugService.createBug(bug);
		assertNotNull(bugId);
	}

	@Test
	void testUpdateBugStatus() {
		BugService bugService = new BugService();
		BugRepository dummyRepo = new DummyBugRepository();
		bugService.setBugRepository(dummyRepo);
		Bug bug = new Bug();
		STATUS status = bugService.updateBugStatus(bug);
		assertNotNull(status);
		assertEquals(STATUS.VERIFIED, status);
	}
	
/*/
	@Test

	void testGetBugById() {
		fail("Not yet implemented");
	}

	
	
/*/
}
