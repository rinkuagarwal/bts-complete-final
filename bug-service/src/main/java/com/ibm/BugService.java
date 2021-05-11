package com.ibm;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BugService {
	@Autowired
	BugRepository bugRepository;

	/**
	 * create bug
	 * 
	 * @param bug
	 * @return the id
	 */
	public String createBug(Bug bug) {
		Bug savedBug = bugRepository.save(bug);
		return savedBug.getId();
	}

	/**
	 * 
	 * @param bugId
	 * @return bug details
	 */

	public Optional<Bug> getBug(String bugName) {
		return bugRepository.findByName(bugName);
	}

	/**
	 * 
	 * @return list of bugs
	 */
	public List<Bug> getBugs() {
		return bugRepository.findAll();
	}

	/**
	 * 
	 * @param bug
	 * @return updated bug
	 * implementing bug life cycle 
	 */

	public STATUS updateBugStatus(@Valid Bug bug) {
		STATUS status = bug.getStatus();
		Optional<Bug> oldBug = bugRepository.findById(bug.getId());
		oldBug.ifPresent(oldbug -> {
			STATUS oldstatus = oldbug.getStatus();
			if (oldstatus == STATUS.NEW) {
				if (status == STATUS.ASSIGNED) {
					bugRepository.save(bug);
				}

				else {
					throw new IllegalArgumentException("STATUS NOT ALLOWED");

				}
			} else if (oldstatus == STATUS.ASSIGNED) {
				if (status == STATUS.OPEN) {
					bugRepository.save(bug);
				}

				else {
					throw new IllegalArgumentException("STATUS NOT ALLOWED");

				}
			} else if (oldstatus == STATUS.OPEN) {
				if (status == STATUS.FIXED) {
					bugRepository.save(bug);
				}

				else {
					throw new IllegalArgumentException("STATUS NOT ALLOWED");

				}
			}

			else if (oldstatus == STATUS.FIXED) {
				if (status == STATUS.PENDING_REQUEST) {
					bugRepository.save(bug);
				}

				else {
					throw new IllegalArgumentException("STATUS NOT ALLOWED");

				}
			} else if (oldstatus == STATUS.PENDING_REQUEST) {
				if (status == STATUS.RETEST) {
					bugRepository.save(bug);
				}

				else {
					throw new IllegalArgumentException("STATUS NOT ALLOWED");

				}
			} else if (oldstatus == STATUS.RETEST) {
				if (status == STATUS.REOPEN || status == STATUS.VERIFIED) {
					bugRepository.save(bug);
				}

				else {
					throw new IllegalArgumentException("STATUS NOT ALLOWED");

				}
			} else if (oldstatus == STATUS.REOPEN) {
				if (status == STATUS.ASSIGNED) {
					bugRepository.save(bug);
				}

				else {
					throw new IllegalArgumentException("STATUS NOT ALLOWED");

				}
			} else if (oldstatus == STATUS.VERIFIED) {
				if (status == STATUS.CLOSED) {
					bugRepository.save(bug);
				}

				else {
					throw new IllegalArgumentException("STATUS NOT ALLOWED");

				}
			} else if (oldstatus == STATUS.CLOSED) {
				if (status == STATUS.CLOSED) {
					bugRepository.save(bug);
				}

				else {
					throw new IllegalArgumentException("STATUS NOT ALLOWED");

				}
			}
		});
		return bug.getStatus();

	}

	public BugRepository getBugRepository() {
		return bugRepository;
	}

	public void setBugRepository(BugRepository bugRepository) {
		this.bugRepository = bugRepository;
	}

	/**
	 * 
	 * @param status
	 * @return list of bug
	 */
	public List<Bug> getBugbyStatus(STATUS status) {

		return bugRepository.findByStatus(status);
	}

	public void deleteBug(String bugId) {
		bugRepository.deleteById(bugId);
		
	}

	

	public List<Bug> findByStatusAndName(STATUS status, String name) {
		return bugRepository.findByStatusAndNameIgnoreCase(status, name);
	}

	public List<Bug> getBugByPartialName(String bugName) {
		return bugRepository.findByNameIgnoreCase(bugName);
	}

	
}
